package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Java Interface
 * Created By Secondary
 * On 2019/8/4 13:18
 * Description: 商品类目dao层
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 获取类目type列表
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
