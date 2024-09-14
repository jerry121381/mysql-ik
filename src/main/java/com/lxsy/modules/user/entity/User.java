package com.lxsy.modules.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户
 * @author: husj
 * @create: 2024-09-14
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -144202899968844851L;

    private Long id;

    private String name;
}
