package com.sise.shop_cart2.mapper;

import com.sise.shop_cart2.pojo.Itemtype;
import com.sise.shop_cart2.pojo.ItemtypeExample;

import java.util.List;

public interface ItemtypeMapper {
    long countByExample(ItemtypeExample example);

    int deleteByExample(ItemtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itemtype record);

    int insertSelective(Itemtype record);

    List<Itemtype> selectByExample(ItemtypeExample example);

    Itemtype selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Itemtype record);

    int updateByPrimaryKey(Itemtype record);
}