package com.imooc.product.enums;

/**
 * Java Enum
 * Created By Secondary
 * On 2019/8/4 13:31
 * Description: 商品状态枚举
 */
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
