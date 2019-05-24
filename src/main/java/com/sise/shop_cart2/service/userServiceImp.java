package com.sise.shop_cart2.service;

import com.sise.shop_cart2.mapper.UserMapper;
import com.sise.shop_cart2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:ljf
 * @date: 2019/5/21
 * @description: 用户service
 **/
@Service
public class userServiceImp  implements  userService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public int userRegister(User user) {
        int i = userMapper.userRegister(user);
        return  i;
    }

    @Override
    public User userLogin(User user) {
       return userMapper.login(user);
    }


}
