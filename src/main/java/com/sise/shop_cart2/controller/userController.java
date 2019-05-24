package com.sise.shop_cart2.controller;

import com.sise.shop_cart2.mapper.UserMapper;
import com.sise.shop_cart2.pojo.User;
import com.sise.shop_cart2.service.userServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:ljf
 * @date: 2019/5/17
 * @description: 用户controller
 **/
@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserMapper userMapper;
     @Autowired
    private com.sise.shop_cart2.service.userServiceImp userService;
    @RequestMapping("ok")
    public String login() {
        return "/user/register";
    }


    @RequestMapping("ok1")
    public String login1() {
        return "/index/first";
    }

    //用户注册
    @RequestMapping(value = "userRegister")
    public String userRegesiter(User user) {
        if (userMapper.userRegister(user) != 0) {
            return "user/login";
        } else {
            return "/index/first";
        }

    }

    //用于检验用户登陆
    @RequestMapping("/login")
    public String userLogin(User user) {

        if (userService.userLogin(user)!= null) {
            System.out.println("ok");
            return "/index/first";
        } else {

            return "faile";
        }
    }

}
