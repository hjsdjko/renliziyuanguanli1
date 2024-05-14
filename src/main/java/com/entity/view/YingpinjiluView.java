package com.entity.view;

import com.entity.YingpinjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 应聘记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yingpinjilu")
public class YingpinjiluView extends YingpinjiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否已面试的值
		*/
		private String mianshiValue;
		/**
		* 面试结果的值
		*/
		private String mianshiJieguoValue;



		//级联表 zhaopinxinxi
			/**
			* 招聘信息名称
			*/
			private String zhaopinxinxiName;
			/**
			* 招聘类型
			*/
			private Integer zhaopinxinxiTypes;
				/**
				* 招聘类型的值
				*/
				private String zhaopinxinxiValue;
			/**
			* 招聘人数
			*/
			private Integer zhaopinxinxiNumber;
			/**
			* 招聘详情
			*/
			private String zhaopinxinxiContent;

	public YingpinjiluView() {

	}

	public YingpinjiluView(YingpinjiluEntity yingpinjiluEntity) {
		try {
			BeanUtils.copyProperties(this, yingpinjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否已面试的值
			*/
			public String getMianshiValue() {
				return mianshiValue;
			}
			/**
			* 设置： 是否已面试的值
			*/
			public void setMianshiValue(String mianshiValue) {
				this.mianshiValue = mianshiValue;
			}
			/**
			* 获取： 面试结果的值
			*/
			public String getMianshiJieguoValue() {
				return mianshiJieguoValue;
			}
			/**
			* 设置： 面试结果的值
			*/
			public void setMianshiJieguoValue(String mianshiJieguoValue) {
				this.mianshiJieguoValue = mianshiJieguoValue;
			}
















				//级联表的get和set zhaopinxinxi
					/**
					* 获取： 招聘信息名称
					*/
					public String getZhaopinxinxiName() {
						return zhaopinxinxiName;
					}
					/**
					* 设置： 招聘信息名称
					*/
					public void setZhaopinxinxiName(String zhaopinxinxiName) {
						this.zhaopinxinxiName = zhaopinxinxiName;
					}
					/**
					* 获取： 招聘类型
					*/
					public Integer getZhaopinxinxiTypes() {
						return zhaopinxinxiTypes;
					}
					/**
					* 设置： 招聘类型
					*/
					public void setZhaopinxinxiTypes(Integer zhaopinxinxiTypes) {
						this.zhaopinxinxiTypes = zhaopinxinxiTypes;
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
					/**
					* 获取： 招聘人数
					*/
					public Integer getZhaopinxinxiNumber() {
						return zhaopinxinxiNumber;
					}
					/**
					* 设置： 招聘人数
					*/
					public void setZhaopinxinxiNumber(Integer zhaopinxinxiNumber) {
						this.zhaopinxinxiNumber = zhaopinxinxiNumber;
					}
					/**
					* 获取： 招聘详情
					*/
					public String getZhaopinxinxiContent() {
						return zhaopinxinxiContent;
					}
					/**
					* 设置： 招聘详情
					*/
					public void setZhaopinxinxiContent(String zhaopinxinxiContent) {
						this.zhaopinxinxiContent = zhaopinxinxiContent;
					}


}
