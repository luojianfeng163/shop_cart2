package com.sise.shop_cart2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.sise.shop_cart2.mapper"})
public class ShopCart2Application {

    public static void main(String[] args) {
        SpringApplication.run(ShopCart2Application.class, args);
    }

}
