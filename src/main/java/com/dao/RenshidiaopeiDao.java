package com.dao;

import com.entity.RenshidiaopeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshidiaopeiView;

/**
 * 人事调配 Dao 接口
 *
 * @author 
 */
public interface RenshidiaopeiDao extends BaseMapper<RenshidiaopeiEntity> {

   List<RenshidiaopeiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
