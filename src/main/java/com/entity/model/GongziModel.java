package com.entity.model;

import com.entity.GongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 工资名称
     */
    private String gongziName;


    /**
     * 发放月份
     */
    private String gongziTime;


    /**
     * 基本工资
     */
    private Double jibenGongzi;


    /**
     * 奖金
     */
    private Double jiangjinGongzi;


    /**
     * 实发工资
     */
    private Double shifaGongzi;


    /**
     * 备注
     */
    private String gongziContent;


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
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：工资名称
	 */
    public String getGongziName() {
        return gongziName;
    }


    /**
	 * 设置：工资名称
	 */
    public void setGongziName(String gongziName) {
        this.gongziName = gongziName;
    }
    /**
	 * 获取：发放月份
	 */
    public String getGongziTime() {
        return gongziTime;
    }


    /**
	 * 设置：发放月份
	 */
    public void setGongziTime(String gongziTime) {
        this.gongziTime = gongziTime;
    }
    /**
	 * 获取：基本工资
	 */
    public Double getJibenGongzi() {
        return jibenGongzi;
    }


    /**
	 * 设置：基本工资
	 */
    public void setJibenGongzi(Double jibenGongzi) {
        this.jibenGongzi = jibenGongzi;
    }
    /**
	 * 获取：奖金
	 */
    public Double getJiangjinGongzi() {
        return jiangjinGongzi;
    }


    /**
	 * 设置：奖金
	 */
    public void setJiangjinGongzi(Double jiangjinGongzi) {
        this.jiangjinGongzi = jiangjinGongzi;
    }
    /**
	 * 获取：实发工资
	 */
    public Double getShifaGongzi() {
        return shifaGongzi;
    }


    /**
	 * 设置：实发工资
	 */
    public void setShifaGongzi(Double shifaGongzi) {
        this.shifaGongzi = shifaGongzi;
    }
    /**
	 * 获取：备注
	 */
    public String getGongziContent() {
        return gongziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGongziContent(String gongziContent) {
        this.gongziContent = gongziContent;
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
