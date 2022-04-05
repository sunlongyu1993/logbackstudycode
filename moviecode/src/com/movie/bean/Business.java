package com.movie.bean;

import java.util.Date;

/**
 * @author 孙珑瑜
 * @version 20220325
 * 商家
 */
public class Business extends User{
    private String shopName;//店铺名称
    private String address;//店铺地址

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
