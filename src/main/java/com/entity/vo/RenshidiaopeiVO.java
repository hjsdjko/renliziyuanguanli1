package com.entity.vo;

import com.entity.RenshidiaopeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 人事调配
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renshidiaopei")
public class RenshidiaopeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 人事调配名称
     */

    @TableField(value = "renshidiaopei_name")
    private String renshidiaopeiName;


    /**
     * 调配详情
     */

    @TableField(value = "renshidiaopei_content")
    private String renshidiaopeiContent;


    /**
     * 调配时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "diaopei_time")
    private Date diaopeiTime;


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
	 * 设置：人事调配名称
	 */
    public String getRenshidiaopeiName() {
        return renshidiaopeiName;
    }


    /**
	 * 获取：人事调配名称
	 */

    public void setRenshidiaopeiName(String renshidiaopeiName) {
        this.renshidiaopeiName = renshidiaopeiName;
    }
    /**
	 * 设置：调配详情
	 */
    public String getRenshidiaopeiContent() {
        return renshidiaopeiContent;
    }


    /**
	 * 获取：调配详情
	 */

    public void setRenshidiaopeiContent(String renshidiaopeiContent) {
        this.renshidiaopeiContent = renshidiaopeiContent;
    }
    /**
	 * 设置：调配时间
	 */
    public Date getDiaopeiTime() {
        return diaopeiTime;
    }


    /**
	 * 获取：调配时间
	 */

    public void setDiaopeiTime(Date diaopeiTime) {
        this.diaopeiTime = diaopeiTime;
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
