package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-04 20:49
 * Description: 商品服务controller
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg ";
    }

}
