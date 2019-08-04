package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/4 15:00
 * Description: 商品返回对象
 */
public class ProductVO {

    @JsonProperty(value = "name")
    private String categoryName;

    @JsonProperty(value = "type")
    private Integer categoryType;

    @JsonProperty(value = "foods")
    List<ProductInfoVO> productInfoVOList;
}
