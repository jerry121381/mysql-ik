package com.lxsy.modules.user.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: userVO
 * @author: husj
 * @create: 2024-09-14
 **/
@Data
public class UserVO implements Serializable {
    private static final long serialVersionUID = 2971812701785698200L;

    private Long id;

    private String name;
}
