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
 * 工资
 *
 * @author 
 * @email
 */
@TableName("gongzi")
public class GongziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongziEntity() {

	}

	public GongziEntity(T t) {
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
     * 员工
     */
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 工资名称
     */
    @TableField(value = "gongzi_name")

    private String gongziName;


    /**
     * 发放月份
     */
    @TableField(value = "gongzi_time")

    private String gongziTime;


    /**
     * 基本工资
     */
    @TableField(value = "jiben_gongzi")

    private Double jibenGongzi;


    /**
     * 奖金
     */
    @TableField(value = "jiangjin_gongzi")

    private Double jiangjinGongzi;


    /**
     * 实发工资
     */
    @TableField(value = "shifa_gongzi")

    private Double shifaGongzi;


    /**
     * 备注
     */
    @TableField(value = "gongzi_content")

    private String gongziContent;


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
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：工资名称
	 */
    public String getGongziName() {
        return gongziName;
    }


    /**
	 * 获取：工资名称
	 */

    public void setGongziName(String gongziName) {
        this.gongziName = gongziName;
    }
    /**
	 * 设置：发放月份
	 */
    public String getGongziTime() {
        return gongziTime;
    }


    /**
	 * 获取：发放月份
	 */

    public void setGongziTime(String gongziTime) {
        this.gongziTime = gongziTime;
    }
    /**
	 * 设置：基本工资
	 */
    public Double getJibenGongzi() {
        return jibenGongzi;
    }


    /**
	 * 获取：基本工资
	 */

    public void setJibenGongzi(Double jibenGongzi) {
        this.jibenGongzi = jibenGongzi;
    }
    /**
	 * 设置：奖金
	 */
    public Double getJiangjinGongzi() {
        return jiangjinGongzi;
    }


    /**
	 * 获取：奖金
	 */

    public void setJiangjinGongzi(Double jiangjinGongzi) {
        this.jiangjinGongzi = jiangjinGongzi;
    }
    /**
	 * 设置：实发工资
	 */
    public Double getShifaGongzi() {
        return shifaGongzi;
    }


    /**
	 * 获取：实发工资
	 */

    public void setShifaGongzi(Double shifaGongzi) {
        this.shifaGongzi = shifaGongzi;
    }
    /**
	 * 设置：备注
	 */
    public String getGongziContent() {
        return gongziContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGongziContent(String gongziContent) {
        this.gongziContent = gongziContent;
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
        return "Gongzi{" +
            "id=" + id +
            ", yuangongId=" + yuangongId +
            ", gongziName=" + gongziName +
            ", gongziTime=" + gongziTime +
            ", jibenGongzi=" + jibenGongzi +
            ", jiangjinGongzi=" + jiangjinGongzi +
            ", shifaGongzi=" + shifaGongzi +
            ", gongziContent=" + gongziContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
