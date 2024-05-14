package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 应聘记录
 *
 * @author 
 * @email
 */
@TableName("yingpinjilu")
public class YingpinjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YingpinjiluEntity() {

	}

	public YingpinjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 招聘信息
     */
    @TableField(value = "zhaopinxinxi_id")

    private Integer zhaopinxinxiId;


    /**
     * 应聘人员姓名
     */
    @TableField(value = "yingpinjilu_name")

    private String yingpinjiluName;


    /**
     * 应聘人员手机号
     */
    @TableField(value = "yingpinjilu_phone")

    private String yingpinjiluPhone;


    /**
     * 应聘人员身份证号
     */
    @TableField(value = "yingpinjilu_id_number")

    private String yingpinjiluIdNumber;


    /**
     * 教育情况
     */
    @TableField(value = "jiaoyu_content")

    private String jiaoyuContent;


    /**
     * 工作经历
     */
    @TableField(value = "gongzuo_content")

    private String gongzuoContent;


    /**
     * 个人介绍
     */
    @TableField(value = "geren_content")

    private String gerenContent;


    /**
     * 应聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yingpin_time")

    private Date yingpinTime;


    /**
     * 是否已面试
     */
    @TableField(value = "mianshi_types")

    private Integer mianshiTypes;


    /**
     * 面试结果
     */
    @TableField(value = "mianshi_jieguo_types")

    private Integer mianshiJieguoTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：招聘信息
	 */
    public Integer getZhaopinxinxiId() {
        return zhaopinxinxiId;
    }


    /**
	 * 获取：招聘信息
	 */

    public void setZhaopinxinxiId(Integer zhaopinxinxiId) {
        this.zhaopinxinxiId = zhaopinxinxiId;
    }
    /**
	 * 设置：应聘人员姓名
	 */
    public String getYingpinjiluName() {
        return yingpinjiluName;
    }


    /**
	 * 获取：应聘人员姓名
	 */

    public void setYingpinjiluName(String yingpinjiluName) {
        this.yingpinjiluName = yingpinjiluName;
    }
    /**
	 * 设置：应聘人员手机号
	 */
    public String getYingpinjiluPhone() {
        return yingpinjiluPhone;
    }


    /**
	 * 获取：应聘人员手机号
	 */

    public void setYingpinjiluPhone(String yingpinjiluPhone) {
        this.yingpinjiluPhone = yingpinjiluPhone;
    }
    /**
	 * 设置：应聘人员身份证号
	 */
    public String getYingpinjiluIdNumber() {
        return yingpinjiluIdNumber;
    }


    /**
	 * 获取：应聘人员身份证号
	 */

    public void setYingpinjiluIdNumber(String yingpinjiluIdNumber) {
        this.yingpinjiluIdNumber = yingpinjiluIdNumber;
    }
    /**
	 * 设置：教育情况
	 */
    public String getJiaoyuContent() {
        return jiaoyuContent;
    }


    /**
	 * 获取：教育情况
	 */

    public void setJiaoyuContent(String jiaoyuContent) {
        this.jiaoyuContent = jiaoyuContent;
    }
    /**
	 * 设置：工作经历
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 获取：工作经历
	 */

    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 设置：个人介绍
	 */
    public String getGerenContent() {
        return gerenContent;
    }


    /**
	 * 获取：个人介绍
	 */

    public void setGerenContent(String gerenContent) {
        this.gerenContent = gerenContent;
    }
    /**
	 * 设置：应聘时间
	 */
    public Date getYingpinTime() {
        return yingpinTime;
    }


    /**
	 * 获取：应聘时间
	 */

    public void setYingpinTime(Date yingpinTime) {
        this.yingpinTime = yingpinTime;
    }
    /**
	 * 设置：是否已面试
	 */
    public Integer getMianshiTypes() {
        return mianshiTypes;
    }


    /**
	 * 获取：是否已面试
	 */

    public void setMianshiTypes(Integer mianshiTypes) {
        this.mianshiTypes = mianshiTypes;
    }
    /**
	 * 设置：面试结果
	 */
    public Integer getMianshiJieguoTypes() {
        return mianshiJieguoTypes;
    }


    /**
	 * 获取：面试结果
	 */

    public void setMianshiJieguoTypes(Integer mianshiJieguoTypes) {
        this.mianshiJieguoTypes = mianshiJieguoTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yingpinjilu{" +
            "id=" + id +
            ", zhaopinxinxiId=" + zhaopinxinxiId +
            ", yingpinjiluName=" + yingpinjiluName +
            ", yingpinjiluPhone=" + yingpinjiluPhone +
            ", yingpinjiluIdNumber=" + yingpinjiluIdNumber +
            ", jiaoyuContent=" + jiaoyuContent +
            ", gongzuoContent=" + gongzuoContent +
            ", gerenContent=" + gerenContent +
            ", yingpinTime=" + yingpinTime +
            ", mianshiTypes=" + mianshiTypes +
            ", mianshiJieguoTypes=" + mianshiJieguoTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
