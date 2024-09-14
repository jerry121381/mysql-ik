package com.lxsy.modules.user.service;

import com.lxsy.modules.user.vo.UserVO;

/**
 * @description: user service
 * @author: husj
 * @create: 2024-09-14
 **/
public interface UserService {


    UserVO getUserById(Long id);
}
