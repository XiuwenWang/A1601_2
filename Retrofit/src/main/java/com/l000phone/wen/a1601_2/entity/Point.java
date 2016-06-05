package com.l000phone.wen.a1601_2.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Point {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("point")
    @Expose
    private Integer point;
    @SerializedName("shop_id")
    @Expose
    private Integer shopId;
    @SerializedName("shop_name")
    @Expose
    private String shopName;

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The point
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point The point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * @return The shopId
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * @param shopId The shop_id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * @return The shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName The shop_name
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}

