package com.l000phone.wen.a1601_2.entity;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("bar_code")
    private String barCode;
    @SerializedName("date")
    private Integer date;
    @SerializedName("id")
    private Integer id;
    @SerializedName("order_id")
    private Integer orderId;
    @SerializedName("product_count")
    private Integer productCount;
    @SerializedName("product_name")
    private String productName;
    @SerializedName("product_price")
    private Integer productPrice;
    @SerializedName("total_pay")
    private Integer totalPay;

    /**
     * @return The barCode
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * @param barCode The bar_code
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * @return The date
     */
    public Integer getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(Integer date) {
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
     * @return The orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId The order_id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return The productCount
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * @param productCount The product_count
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * @return The productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName The product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return The productPrice
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice The product_price
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return The totalPay
     */
    public Integer getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay The total_pay
     */
    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }

}