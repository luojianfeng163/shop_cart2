package com.sise.shop_cart2.service;

import com.sise.shop_cart2.pojo.User;

public interface userService {
    //用户注册
    public int  userRegister(User user);
    //用户登陆
    public  User  userLogin(User user);


}
