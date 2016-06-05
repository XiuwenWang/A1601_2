package com.l000phone.wen.a1601_2.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    @SerializedName("actual_pay")
    @Expose
    private Integer actualPay;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("area_code")
    @Expose
    private String areaCode;
    @SerializedName("buyer_id")
    @Expose
    private String buyerId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_code")
    @Expose
    private String cityCode;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("create_time")
    @Expose
    private String createTime;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("express")
    @Expose
    private String express;
    @SerializedName("express_code")
    @Expose
    private String expressCode;
    @SerializedName("favourable_money")
    @Expose
    private Integer favourableMoney;
    @SerializedName("freight")
    @Expose
    private Integer freight;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("in_freight")
    @Expose
    private Integer inFreight;
    @SerializedName("mobil_phone")
    @Expose
    private String mobilPhone;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("orig_pay")
    @Expose
    private Integer origPay;
    @SerializedName("pay_method")
    @Expose
    private String payMethod;
    @SerializedName("pay_status")
    @Expose
    private String payStatus;
    @SerializedName("pay_time")
    @Expose
    private String payTime;
    @SerializedName("point")
    @Expose
    private Point point;
    @SerializedName("post_code")
    @Expose
    private String postCode;
    @SerializedName("product_count")
    @Expose
    private Integer productCount;
    @SerializedName("products")
    @Expose
    private List<Product> products = new ArrayList<Product>();
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("province_code")
    @Expose
    private String provinceCode;
    @SerializedName("shop_id")
    @Expose
    private Integer shopId;
    @SerializedName("shop_name")
    @Expose
    private String shopName;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("storage_id")
    @Expose
    private Integer storageId;
    @SerializedName("tel_phone")
    @Expose
    private String telPhone;
    @SerializedName("total_pay")
    @Expose
    private Integer totalPay;
    @SerializedName("total_weight")
    @Expose
    private Double totalWeight;

    /**
     * @return The actualPay
     */
    public Integer getActualPay() {
        return actualPay;
    }

    /**
     * @param actualPay The actual_pay
     */
    public void setActualPay(Integer actualPay) {
        this.actualPay = actualPay;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area The area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return The areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode The area_code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return The buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId The buyer_id
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode The city_code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return The code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return The createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime The create_time
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
     * @return The express
     */
    public String getExpress() {
        return express;
    }

    /**
     * @param express The express
     */
    public void setExpress(String express) {
        this.express = express;
    }

    /**
     * @return The expressCode
     */
    public String getExpressCode() {
        return expressCode;
    }

    /**
     * @param expressCode The express_code
     */
    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    /**
     * @return The favourableMoney
     */
    public Integer getFavourableMoney() {
        return favourableMoney;
    }

    /**
     * @param favourableMoney The favourable_money
     */
    public void setFavourableMoney(Integer favourableMoney) {
        this.favourableMoney = favourableMoney;
    }

    /**
     * @return The freight
     */
    public Integer getFreight() {
        return freight;
    }

    /**
     * @param freight The freight
     */
    public void setFreight(Integer freight) {
        this.freight = freight;
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
     * @return The inFreight
     */
    public Integer getInFreight() {
        return inFreight;
    }

    /**
     * @param inFreight The in_freight
     */
    public void setInFreight(Integer inFreight) {
        this.inFreight = inFreight;
    }

    /**
     * @return The mobilPhone
     */
    public String getMobilPhone() {
        return mobilPhone;
    }

    /**
     * @param mobilPhone The mobil_phone
     */
    public void setMobilPhone(String mobilPhone) {
        this.mobilPhone = mobilPhone;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note The note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return The origPay
     */
    public Integer getOrigPay() {
        return origPay;
    }

    /**
     * @param origPay The orig_pay
     */
    public void setOrigPay(Integer origPay) {
        this.origPay = origPay;
    }

    /**
     * @return The payMethod
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod The pay_method
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * @return The payStatus
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus The pay_status
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return The payTime
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * @param payTime The pay_time
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     * @return The point
     */
    public Point getPoint() {
        return point;
    }

    /**
     * @param point The point
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * @return The postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * @param postCode The post_code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
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
     * @return The products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products The products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return The province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province The province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return The provinceCode
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode The province_code
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    /**
     * @return The state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state The state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return The storageId
     */
    public Integer getStorageId() {
        return storageId;
    }

    /**
     * @param storageId The storage_id
     */
    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    /**
     * @return The telPhone
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * @param telPhone The tel_phone
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
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

    /**
     * @return The totalWeight
     */
    public Double getTotalWeight() {
        return totalWeight;
    }

    /**
     * @param totalWeight The total_weight
     */
    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

}


