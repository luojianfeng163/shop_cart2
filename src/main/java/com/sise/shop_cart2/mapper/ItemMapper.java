package com.sise.shop_cart2.mapper;

import com.sise.shop_cart2.pojo.Item;
import com.sise.shop_cart2.pojo.ItemExample;

import java.util.List;

public interface ItemMapper {
   //在首页显示所有商品
    List<Item>  showAllitem();
    //通过商品ID来查找一件商品
    Item findItemByID(int id);
}