package com.lxsy.modules.selectcategory.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: select category correlation
 * @author: husj
 * @create: 2024-09-20
 **/
@TableName(value = "lxsy_select_category_correlation")
@Data
public class SelectCategoryCorrelation implements Serializable {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 分类菜单id
     */
    private Long categoryId;

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