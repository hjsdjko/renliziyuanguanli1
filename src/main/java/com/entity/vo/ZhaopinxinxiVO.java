package com.entity.vo;

import com.entity.ZhaopinxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 招聘信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaopinxinxi")
public class ZhaopinxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
