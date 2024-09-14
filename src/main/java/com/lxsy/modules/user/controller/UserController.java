package com.lxsy.modules.user.controller;

import com.lxsy.modules.user.service.UserService;
import com.lxsy.modules.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: user controller
 * @author: husj
 * @create: 2024-09-14
 **/
@RestController
@RequestMapping("/lxsy")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/{id}")
    public UserVO getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}
