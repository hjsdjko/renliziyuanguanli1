package com.entity.view;

import com.entity.YuangongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 员工
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yuangong")
public class YuangongView extends YuangongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;



		//级联表 bumen
			/**
			* 部门名称
			*/
			private String bumenName;
			/**
			* 部门人数
			*/
			private Integer bumenNumber;
			/**
			* 部门职责
			*/
			private String bumenZhize;
			/**
			* 部门介绍
			*/
			private String bumenContent;

	public YuangongView() {

	}

	public YuangongView(YuangongEntity yuangongEntity) {
		try {
			BeanUtils.copyProperties(this, yuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}




				//级联表的get和set bumen
					/**
					* 获取： 部门名称
					*/
					public String getBumenName() {
						return bumenName;
					}
					/**
					* 设置： 部门名称
					*/
					public void setBumenName(String bumenName) {
						this.bumenName = bumenName;
					}
					/**
					* 获取： 部门人数
					*/
					public Integer getBumenNumber() {
						return bumenNumber;
					}
					/**
					* 设置： 部门人数
					*/
					public void setBumenNumber(Integer bumenNumber) {
						this.bumenNumber = bumenNumber;
					}
					/**
					* 获取： 部门职责
					*/
					public String getBumenZhize() {
						return bumenZhize;
					}
					/**
					* 设置： 部门职责
					*/
					public void setBumenZhize(String bumenZhize) {
						this.bumenZhize = bumenZhize;
					}
					/**
					* 获取： 部门介绍
					*/
					public String getBumenContent() {
						return bumenContent;
					}
					/**
					* 设置： 部门介绍
					*/
					public void setBumenContent(String bumenContent) {
						this.bumenContent = bumenContent;
					}














}
