package com.dao;

import com.entity.GongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongziView;

/**
 * 工资 Dao 接口
 *
 * @author 
 */
public interface GongziDao extends BaseMapper<GongziEntity> {

   List<GongziView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
