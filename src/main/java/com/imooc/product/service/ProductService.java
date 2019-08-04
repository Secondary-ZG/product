package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Java Interface
 * Created By Secondary
 * On 2019/8/4 13:27
 * Description: 商品service
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

}
