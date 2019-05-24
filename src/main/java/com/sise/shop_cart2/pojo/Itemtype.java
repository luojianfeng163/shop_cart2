package com.sise.shop_cart2.pojo;

public class Itemtype {
    private Integer id;

    private String itemname;

    public Itemtype(Integer id, String itemname) {
        this.id = id;
        this.itemname = itemname;
    }

    public Itemtype() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }
}