package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-05 20:45
 * Description:
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
