package com.lxsy.modules.brand.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: bind category DTO
 * @author: husj
 * @create: 2024-09-20
 **/
@Data
public class BindCategoryDTO implements Serializable {
    private static final long serialVersionUID = -2659204589217597487L;

    private Long id;

    private List<String> keyword;
}
