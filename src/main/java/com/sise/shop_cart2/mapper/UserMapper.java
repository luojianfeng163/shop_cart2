package com.sise.shop_cart2.mapper;


import com.sise.shop_cart2.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 这是一个对用户增删改查操作的一个接口
 *
 *
 */

public interface UserMapper {
  void  addUser(User user);
  User  login(User user);
  int  userRegister(User user);
}