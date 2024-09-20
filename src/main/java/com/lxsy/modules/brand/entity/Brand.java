package com.lxsy.modules.brand.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: brand
 * @author: husj
 * @create: 2024-09-20
 **/
@Data
@TableName(value = "lxsy_brand")
public class Brand implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 组织-商标编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 商标号
     */
    private String brandNumber;

    /**
     * 商标名称
     */
    private String brandName;

    /**
     * 商标图片
     */
    private String brandImage;

    /**
     * 商标证明
     */
    private String brandProveImage;

    /**
     * 联合声明
     */
    private String jointDeclaration;

    /**
     * 商标状态,0:未审核, 1:已审核，2:审核未通过
     */
    private Integer brandStatus;

    /**
     * 租户CODE
     */
    private String tenantCode;

    /**
     * 删除标识：0-正常，1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 用户举报时查询是否显示 0:不显示 1:显示
     */
    private Integer isShow;
}