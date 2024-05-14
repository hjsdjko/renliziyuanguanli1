package com.dao;

import com.entity.ZhaopinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinxinxiView;

/**
 * 招聘信息 Dao 接口
 *
 * @author 
 */
public interface ZhaopinxinxiDao extends BaseMapper<ZhaopinxinxiEntity> {

   List<ZhaopinxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
