package com.sise.shop_cart2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:ljf
 * @date: 2019/5/18
 * @description: 测试controller
 **/
@Controller
@RequestMapping("/test")
public class testController {

    @RequestMapping("/test1")

    public String test1(){

        return "/user/login";
    }
}
