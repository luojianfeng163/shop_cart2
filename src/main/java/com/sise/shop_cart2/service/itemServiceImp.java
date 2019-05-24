package com.sise.shop_cart2.service;

import com.sise.shop_cart2.mapper.ItemMapper;
import com.sise.shop_cart2.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:ljf
 * @date: 2019/5/21
 * @description: itemService的实现类
 **/
public class itemServiceImp implements  itemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findItemByID(int id) {
        return itemMapper.findItemByID(id);
    }
}
