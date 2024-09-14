package com.lxsy.modules.user.service.impl;

import com.lxsy.modules.user.entity.User;
import com.lxsy.modules.user.mapper.UserMapper;
import com.lxsy.modules.user.service.UserService;
import com.lxsy.modules.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: user service impl
 * @author: husj
 * @create: 2024-09-14
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserVO getUserById(Long id) {
        User user = userMapper.getUserById(id);
        if (user != null) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            return userVO;
        } else {
            return null;
        }
    }
}
