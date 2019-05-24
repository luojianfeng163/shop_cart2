package com.sise.shop_cart2.service;

import com.sise.shop_cart2.pojo.Item;

public interface itemService {
    //通过商品ID来查找商品
    public Item findItemByID(int id);
}
