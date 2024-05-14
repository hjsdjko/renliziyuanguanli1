package com.entity.view;

import com.entity.ZhaopinxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 招聘信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhaopinxinxi")
public class ZhaopinxinxiView extends ZhaopinxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 招聘类型的值
		*/
		private String zhaopinxinxiValue;



	public ZhaopinxinxiView() {

	}

	public ZhaopinxinxiView(ZhaopinxinxiEntity zhaopinxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 招聘类型的值
			*/
			public String getZhaopinxinxiValue() {
				return zhaopinxinxiValue;
			}
			/**
			* 设置： 招聘类型的值
			*/
			public void setZhaopinxinxiValue(String zhaopinxinxiValue) {
				this.zhaopinxinxiValue = zhaopinxinxiValue;
			}










}
