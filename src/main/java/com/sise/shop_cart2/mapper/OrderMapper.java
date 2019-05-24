package com.sise.shop_cart2.mapper;


import com.sise.shop_cart2.pojo.Order;
import com.sise.shop_cart2.pojo.OrderExample;

import java.util.List;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderid);


    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}