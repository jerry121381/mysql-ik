package com.lxsy.modules.selectkeyword.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: select keyword correlation
 * @author: husj
 * @create: 2024-09-20
 **/
@Data
@TableName(value = "lxsy_select_keyword_correlation")
public class SelectKeywordCorrelation implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关键字id
     */
    private Long keywordId;

    /**
     * 关联的主体id
     */
    private Long correlationId;

    /**
     * 关联的主体类型 1-商标权 2-品种权 3-专利权
     */
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}