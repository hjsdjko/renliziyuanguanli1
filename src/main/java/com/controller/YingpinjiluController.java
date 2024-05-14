
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 应聘记录
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yingpinjilu")
public class YingpinjiluController {
    private static final Logger logger = LoggerFactory.getLogger(YingpinjiluController.class);

    @Autowired
    private YingpinjiluService yingpinjiluService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ZhaopinxinxiService zhaopinxinxiService;

    @Autowired
    private YuangongService yuangongService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yingpinjiluService.queryPage(params);

        //字典表数据转换
        List<YingpinjiluView> list =(List<YingpinjiluView>)page.getList();
        for(YingpinjiluView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YingpinjiluEntity yingpinjilu = yingpinjiluService.selectById(id);
        if(yingpinjilu !=null){
            //entity转view
            YingpinjiluView view = new YingpinjiluView();
            BeanUtils.copyProperties( yingpinjilu , view );//把实体数据重构到view中

                //级联表
                ZhaopinxinxiEntity zhaopinxinxi = zhaopinxinxiService.selectById(yingpinjilu.getZhaopinxinxiId());
                if(zhaopinxinxi != null){
                    BeanUtils.copyProperties( zhaopinxinxi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setZhaopinxinxiId(zhaopinxinxi.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YingpinjiluEntity yingpinjilu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yingpinjilu:{}",this.getClass().getName(),yingpinjilu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<YingpinjiluEntity> queryWrapper = new EntityWrapper<YingpinjiluEntity>()
            .eq("zhaopinxinxi_id", yingpinjilu.getZhaopinxinxiId())
            .eq("yingpinjilu_name", yingpinjilu.getYingpinjiluName())
            .eq("yingpinjilu_phone", yingpinjilu.getYingpinjiluPhone())
            .eq("yingpinjilu_id_number", yingpinjilu.getYingpinjiluIdNumber())
            .eq("mianshi_types", yingpinjilu.getMianshiTypes())
            .eq("mianshi_jieguo_types", yingpinjilu.getMianshiJieguoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YingpinjiluEntity yingpinjiluEntity = yingpinjiluService.selectOne(queryWrapper);
        if(yingpinjiluEntity==null){
            yingpinjilu.setInsertTime(new Date());
            yingpinjilu.setCreateTime(new Date());
            yingpinjiluService.insert(yingpinjilu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YingpinjiluEntity yingpinjilu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yingpinjilu:{}",this.getClass().getName(),yingpinjilu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<YingpinjiluEntity> queryWrapper = new EntityWrapper<YingpinjiluEntity>()
            .notIn("id",yingpinjilu.getId())
            .andNew()
            .eq("zhaopinxinxi_id", yingpinjilu.getZhaopinxinxiId())
            .eq("yingpinjilu_name", yingpinjilu.getYingpinjiluName())
            .eq("yingpinjilu_phone", yingpinjilu.getYingpinjiluPhone())
            .eq("yingpinjilu_id_number", yingpinjilu.getYingpinjiluIdNumber())
            .eq("mianshi_types", yingpinjilu.getMianshiTypes())
            .eq("mianshi_jieguo_types", yingpinjilu.getMianshiJieguoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YingpinjiluEntity yingpinjiluEntity = yingpinjiluService.selectOne(queryWrapper);
        if(yingpinjiluEntity==null){
            yingpinjiluService.updateById(yingpinjilu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yingpinjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<YingpinjiluEntity> yingpinjiluList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YingpinjiluEntity yingpinjiluEntity = new YingpinjiluEntity();
//                            yingpinjiluEntity.setZhaopinxinxiId(Integer.valueOf(data.get(0)));   //招聘信息 要改的
//                            yingpinjiluEntity.setYingpinjiluName(data.get(0));                    //应聘人员姓名 要改的
//                            yingpinjiluEntity.setYingpinjiluPhone(data.get(0));                    //应聘人员手机号 要改的
//                            yingpinjiluEntity.setYingpinjiluIdNumber(data.get(0));                    //应聘人员身份证号 要改的
//                            yingpinjiluEntity.setJiaoyuContent("");//照片
//                            yingpinjiluEntity.setGongzuoContent("");//照片
//                            yingpinjiluEntity.setGerenContent("");//照片
//                            yingpinjiluEntity.setYingpinTime(new Date(data.get(0)));          //应聘时间 要改的
//                            yingpinjiluEntity.setMianshiTypes(Integer.valueOf(data.get(0)));   //是否已面试 要改的
//                            yingpinjiluEntity.setMianshiJieguoTypes(Integer.valueOf(data.get(0)));   //面试结果 要改的
//                            yingpinjiluEntity.setInsertTime(date);//时间
//                            yingpinjiluEntity.setCreateTime(date);//时间
                            yingpinjiluList.add(yingpinjiluEntity);


                            //把要查询是否重复的字段放入map中
                                //应聘人员手机号
                                if(seachFields.containsKey("yingpinjiluPhone")){
                                    List<String> yingpinjiluPhone = seachFields.get("yingpinjiluPhone");
                                    yingpinjiluPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> yingpinjiluPhone = new ArrayList<>();
                                    yingpinjiluPhone.add(data.get(0));//要改的
                                    seachFields.put("yingpinjiluPhone",yingpinjiluPhone);
                                }
                                //应聘人员身份证号
                                if(seachFields.containsKey("yingpinjiluIdNumber")){
                                    List<String> yingpinjiluIdNumber = seachFields.get("yingpinjiluIdNumber");
                                    yingpinjiluIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yingpinjiluIdNumber = new ArrayList<>();
                                    yingpinjiluIdNumber.add(data.get(0));//要改的
                                    seachFields.put("yingpinjiluIdNumber",yingpinjiluIdNumber);
                                }
                        }

                        //查询是否重复
                         //应聘人员手机号
                        List<YingpinjiluEntity> yingpinjiluEntities_yingpinjiluPhone = yingpinjiluService.selectList(new EntityWrapper<YingpinjiluEntity>().in("yingpinjilu_phone", seachFields.get("yingpinjiluPhone")));
                        if(yingpinjiluEntities_yingpinjiluPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YingpinjiluEntity s:yingpinjiluEntities_yingpinjiluPhone){
                                repeatFields.add(s.getYingpinjiluPhone());
                            }
                            return R.error(511,"数据库的该表中的 [应聘人员手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //应聘人员身份证号
                        List<YingpinjiluEntity> yingpinjiluEntities_yingpinjiluIdNumber = yingpinjiluService.selectList(new EntityWrapper<YingpinjiluEntity>().in("yingpinjilu_id_number", seachFields.get("yingpinjiluIdNumber")));
                        if(yingpinjiluEntities_yingpinjiluIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YingpinjiluEntity s:yingpinjiluEntities_yingpinjiluIdNumber){
                                repeatFields.add(s.getYingpinjiluIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [应聘人员身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yingpinjiluService.insertBatch(yingpinjiluList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
