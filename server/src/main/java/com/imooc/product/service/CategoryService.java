package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * Java Interface
 * Created By Secondary
 * On 2019/8/4 13:43
 * Description: 商品类目service
 */
public interface CategoryService {

    /**
     * 获取商品类目列表
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
