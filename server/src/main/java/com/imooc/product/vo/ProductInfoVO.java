package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/4 15:03
 * Description: 商品信息返回对象
 */
public class ProductInfoVO {

    @JsonProperty(value = "id")
    private String productId;

    @JsonProperty(value = "name")
    private String productName;

    @JsonProperty(value = "price")
    private BigDecimal productPrice;

    @JsonProperty(value = "description")
    private String productDescription;

    @JsonProperty(value = "icon")
    private String productIcon;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }
}
