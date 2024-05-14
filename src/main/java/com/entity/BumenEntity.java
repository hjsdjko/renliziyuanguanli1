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
 * 部门
 *
 * @author 
 * @email
 */
@TableName("bumen")
public class BumenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BumenEntity() {

	}

	public BumenEntity(T t) {
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
     * 部门名称
     */
    @TableField(value = "bumen_name")

    private String bumenName;


    /**
     * 部门人数
     */
    @TableField(value = "bumen_number")

    private Integer bumenNumber;


    /**
     * 部门职责
     */
    @TableField(value = "bumen_zhize")

    private String bumenZhize;


    /**
     * 部门介绍
     */
    @TableField(value = "bumen_content")

    private String bumenContent;


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
	 * 设置：部门名称
	 */
    public String getBumenName() {
        return bumenName;
    }


    /**
	 * 获取：部门名称
	 */

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }
    /**
	 * 设置：部门人数
	 */
    public Integer getBumenNumber() {
        return bumenNumber;
    }


    /**
	 * 获取：部门人数
	 */

    public void setBumenNumber(Integer bumenNumber) {
        this.bumenNumber = bumenNumber;
    }
    /**
	 * 设置：部门职责
	 */
    public String getBumenZhize() {
        return bumenZhize;
    }


    /**
	 * 获取：部门职责
	 */

    public void setBumenZhize(String bumenZhize) {
        this.bumenZhize = bumenZhize;
    }
    /**
	 * 设置：部门介绍
	 */
    public String getBumenContent() {
        return bumenContent;
    }


    /**
	 * 获取：部门介绍
	 */

    public void setBumenContent(String bumenContent) {
        this.bumenContent = bumenContent;
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
        return "Bumen{" +
            "id=" + id +
            ", bumenName=" + bumenName +
            ", bumenNumber=" + bumenNumber +
            ", bumenZhize=" + bumenZhize +
            ", bumenContent=" + bumenContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
