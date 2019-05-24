package com.sise.shop_cart2.controller;

import com.sise.shop_cart2.mapper.ItemMapper;
import com.sise.shop_cart2.pojo.Item;
import com.sise.shop_cart2.pojo.User;
import com.sise.shop_cart2.service.itemService;
import com.sise.shop_cart2.service.itemServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author:ljf
 * @date: 2019/5/18
 * @description: 商品controller
 **/
@Controller
@RequestMapping("/shop")
public class itemController {
    @Autowired
    private ItemMapper itemMapper;


    @RequestMapping("/bookstore")
    public String  showItem(Model model){
        List<Item> items=itemMapper.showAllitem();

        model.addAttribute("lists",items);
        return "product/product_list";
    }
    @RequestMapping("/bookinfo")
    public ModelAndView  showBookDetails(ModelAndView modelAndView, int id){
        Item item = itemMapper.findItemByID(id);
        System.out.println(item.toString());
        modelAndView.addObject("book",item);
        modelAndView.setViewName("product/product_info");
        return modelAndView;
    }
}
