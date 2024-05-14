package com.entity.model;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 部门
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BumenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
	 * 获取：部门名称
	 */
    public String getBumenName() {
        return bumenName;
    }


    /**
	 * 设置：部门名称
	 */
    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }
    /**
	 * 获取：部门人数
	 */
    public Integer getBumenNumber() {
        return bumenNumber;
    }


    /**
	 * 设置：部门人数
	 */
    public void setBumenNumber(Integer bumenNumber) {
        this.bumenNumber = bumenNumber;
    }
    /**
	 * 获取：部门职责
	 */
    public String getBumenZhize() {
        return bumenZhize;
    }


    /**
	 * 设置：部门职责
	 */
    public void setBumenZhize(String bumenZhize) {
        this.bumenZhize = bumenZhize;
    }
    /**
	 * 获取：部门介绍
	 */
    public String getBumenContent() {
        return bumenContent;
    }


    /**
	 * 设置：部门介绍
	 */
    public void setBumenContent(String bumenContent) {
        this.bumenContent = bumenContent;
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
