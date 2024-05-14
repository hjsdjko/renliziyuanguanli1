package com.entity.model;

import com.entity.YingpinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 应聘记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YingpinjiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 招聘信息
     */
    private Integer zhaopinxinxiId;


    /**
     * 应聘人员姓名
     */
    private String yingpinjiluName;


    /**
     * 应聘人员手机号
     */
    private String yingpinjiluPhone;


    /**
     * 应聘人员身份证号
     */
    private String yingpinjiluIdNumber;


    /**
     * 教育情况
     */
    private String jiaoyuContent;


    /**
     * 工作经历
     */
    private String gongzuoContent;


    /**
     * 个人介绍
     */
    private String gerenContent;


    /**
     * 应聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yingpinTime;


    /**
     * 是否已面试
     */
    private Integer mianshiTypes;


    /**
     * 面试结果
     */
    private Integer mianshiJieguoTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：招聘信息
	 */
    public Integer getZhaopinxinxiId() {
        return zhaopinxinxiId;
    }


    /**
	 * 设置：招聘信息
	 */
    public void setZhaopinxinxiId(Integer zhaopinxinxiId) {
        this.zhaopinxinxiId = zhaopinxinxiId;
    }
    /**
	 * 获取：应聘人员姓名
	 */
    public String getYingpinjiluName() {
        return yingpinjiluName;
    }


    /**
	 * 设置：应聘人员姓名
	 */
    public void setYingpinjiluName(String yingpinjiluName) {
        this.yingpinjiluName = yingpinjiluName;
    }
    /**
	 * 获取：应聘人员手机号
	 */
    public String getYingpinjiluPhone() {
        return yingpinjiluPhone;
    }


    /**
	 * 设置：应聘人员手机号
	 */
    public void setYingpinjiluPhone(String yingpinjiluPhone) {
        this.yingpinjiluPhone = yingpinjiluPhone;
    }
    /**
	 * 获取：应聘人员身份证号
	 */
    public String getYingpinjiluIdNumber() {
        return yingpinjiluIdNumber;
    }


    /**
	 * 设置：应聘人员身份证号
	 */
    public void setYingpinjiluIdNumber(String yingpinjiluIdNumber) {
        this.yingpinjiluIdNumber = yingpinjiluIdNumber;
    }
    /**
	 * 获取：教育情况
	 */
    public String getJiaoyuContent() {
        return jiaoyuContent;
    }


    /**
	 * 设置：教育情况
	 */
    public void setJiaoyuContent(String jiaoyuContent) {
        this.jiaoyuContent = jiaoyuContent;
    }
    /**
	 * 获取：工作经历
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 设置：工作经历
	 */
    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 获取：个人介绍
	 */
    public String getGerenContent() {
        return gerenContent;
    }


    /**
	 * 设置：个人介绍
	 */
    public void setGerenContent(String gerenContent) {
        this.gerenContent = gerenContent;
    }
    /**
	 * 获取：应聘时间
	 */
    public Date getYingpinTime() {
        return yingpinTime;
    }


    /**
	 * 设置：应聘时间
	 */
    public void setYingpinTime(Date yingpinTime) {
        this.yingpinTime = yingpinTime;
    }
    /**
	 * 获取：是否已面试
	 */
    public Integer getMianshiTypes() {
        return mianshiTypes;
    }


    /**
	 * 设置：是否已面试
	 */
    public void setMianshiTypes(Integer mianshiTypes) {
        this.mianshiTypes = mianshiTypes;
    }
    /**
	 * 获取：面试结果
	 */
    public Integer getMianshiJieguoTypes() {
        return mianshiJieguoTypes;
    }


    /**
	 * 设置：面试结果
	 */
    public void setMianshiJieguoTypes(Integer mianshiJieguoTypes) {
        this.mianshiJieguoTypes = mianshiJieguoTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
