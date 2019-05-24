package com.sise.shop_cart2.mapper;

import com.sise.shop_cart2.pojo.Admin;
import com.sise.shop_cart2.pojo.AdminExample;

import java.util.List;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(String user);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(String user);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}