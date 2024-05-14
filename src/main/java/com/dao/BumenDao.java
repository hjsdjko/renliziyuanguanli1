package com.dao;

import com.entity.BumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenView;

/**
 * 部门 Dao 接口
 *
 * @author 
 */
public interface BumenDao extends BaseMapper<BumenEntity> {

   List<BumenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
