package com.lxsy.modules.selectkeyword.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: select keyword
 * @author: husj
 * @create: 2024-09-20
 **/
@Data
@TableName(value = "lxsy_select_keyword")
public class SelectKeyword implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 查询关键字
     */
    private String keyword;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private Long updateUser;

    /**
     * 删除标识
     */
    @TableLogic
    private Integer isDeleted;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}