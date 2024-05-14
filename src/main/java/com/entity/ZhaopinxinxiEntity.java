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
 * 招聘信息
 *
 * @author 
 * @email
 */
@TableName("zhaopinxinxi")
public class ZhaopinxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopinxinxiEntity() {

	}

	public ZhaopinxinxiEntity(T t) {
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
     * 招聘信息名称
     */
    @TableField(value = "zhaopinxinxi_name")

    private String zhaopinxinxiName;


    /**
     * 招聘类型
     */
    @TableField(value = "zhaopinxinxi_types")

    private Integer zhaopinxinxiTypes;


    /**
     * 招聘人数
     */
    @TableField(value = "zhaopinxinxi_number")

    private Integer zhaopinxinxiNumber;


    /**
     * 招聘详情
     */
    @TableField(value = "zhaopinxinxi_content")

    private String zhaopinxinxiContent;


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
	 * 设置：招聘信息名称
	 */
    public String getZhaopinxinxiName() {
        return zhaopinxinxiName;
    }


    /**
	 * 获取：招聘信息名称
	 */

    public void setZhaopinxinxiName(String zhaopinxinxiName) {
        this.zhaopinxinxiName = zhaopinxinxiName;
    }
    /**
	 * 设置：招聘类型
	 */
    public Integer getZhaopinxinxiTypes() {
        return zhaopinxinxiTypes;
    }


    /**
	 * 获取：招聘类型
	 */

    public void setZhaopinxinxiTypes(Integer zhaopinxinxiTypes) {
        this.zhaopinxinxiTypes = zhaopinxinxiTypes;
    }
    /**
	 * 设置：招聘人数
	 */
    public Integer getZhaopinxinxiNumber() {
        return zhaopinxinxiNumber;
    }


    /**
	 * 获取：招聘人数
	 */

    public void setZhaopinxinxiNumber(Integer zhaopinxinxiNumber) {
        this.zhaopinxinxiNumber = zhaopinxinxiNumber;
    }
    /**
	 * 设置：招聘详情
	 */
    public String getZhaopinxinxiContent() {
        return zhaopinxinxiContent;
    }


    /**
	 * 获取：招聘详情
	 */

    public void setZhaopinxinxiContent(String zhaopinxinxiContent) {
        this.zhaopinxinxiContent = zhaopinxinxiContent;
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
        return "Zhaopinxinxi{" +
            "id=" + id +
            ", zhaopinxinxiName=" + zhaopinxinxiName +
            ", zhaopinxinxiTypes=" + zhaopinxinxiTypes +
            ", zhaopinxinxiNumber=" + zhaopinxinxiNumber +
            ", zhaopinxinxiContent=" + zhaopinxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
