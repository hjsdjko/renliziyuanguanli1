package com.entity.vo;

import com.entity.BumenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 部门
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bumen")
public class BumenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
