package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongziEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 工资 服务类
 */
public interface GongziService extends IService<GongziEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}