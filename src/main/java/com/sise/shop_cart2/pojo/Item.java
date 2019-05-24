package com.sise.shop_cart2.pojo;

public class Item {
    private Integer id;

    private String name;

    private Float originprice;

    private Float presentprice;

    private String stock;

    private String imga;

    private String imgb;

    private String type;

    public Item(Integer id, String name, Float originprice, Float presentprice, String stock, String imga, String imgb, String type) {
        this.id = id;
        this.name = name;
        this.originprice = originprice;
        this.presentprice = presentprice;
        this.stock = stock;
        this.imga = imga;
        this.imgb = imgb;
        this.type = type;
    }

    public Item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getOriginprice() {
        return originprice;
    }

    public void setOriginprice(Float originprice) {
        this.originprice = originprice;
    }

    public Float getPresentprice() {
        return presentprice;
    }

    public void setPresentprice(Float presentprice) {
        this.presentprice = presentprice;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public String getImga() {
        return imga;
    }

    public void setImga(String imga) {
        this.imga = imga == null ? null : imga.trim();
    }

    public String getImgb() {
        return imgb;
    }

    public void setImgb(String imgb) {
        this.imgb = imgb == null ? null : imgb.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originprice=" + originprice +
                ", presentprice=" + presentprice +
                ", stock='" + stock + '\'' +
                ", imga='" + imga + '\'' +
                ", imgb='" + imgb + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}