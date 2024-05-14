package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 招聘信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaopinxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 招聘信息名称
     */
    private String zhaopinxinxiName;


    /**
     * 招聘类型
     */
    private Integer zhaopinxinxiTypes;


    /**
     * 招聘人数
     */
    private Integer zhaopinxinxiNumber;


    /**
     * 招聘详情
     */
    private String zhaopinxinxiContent;


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
	 * 获取：招聘信息名称
	 */
    public String getZhaopinxinxiName() {
        return zhaopinxinxiName;
    }


    /**
	 * 设置：招聘信息名称
	 */
    public void setZhaopinxinxiName(String zhaopinxinxiName) {
        this.zhaopinxinxiName = zhaopinxinxiName;
    }
    /**
	 * 获取：招聘类型
	 */
    public Integer getZhaopinxinxiTypes() {
        return zhaopinxinxiTypes;
    }


    /**
	 * 设置：招聘类型
	 */
    public void setZhaopinxinxiTypes(Integer zhaopinxinxiTypes) {
        this.zhaopinxinxiTypes = zhaopinxinxiTypes;
    }
    /**
	 * 获取：招聘人数
	 */
    public Integer getZhaopinxinxiNumber() {
        return zhaopinxinxiNumber;
    }


    /**
	 * 设置：招聘人数
	 */
    public void setZhaopinxinxiNumber(Integer zhaopinxinxiNumber) {
        this.zhaopinxinxiNumber = zhaopinxinxiNumber;
    }
    /**
	 * 获取：招聘详情
	 */
    public String getZhaopinxinxiContent() {
        return zhaopinxinxiContent;
    }


    /**
	 * 设置：招聘详情
	 */
    public void setZhaopinxinxiContent(String zhaopinxinxiContent) {
        this.zhaopinxinxiContent = zhaopinxinxiContent;
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
