package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Java Interface
 * Created By Secondary
 * On 2019/8/4 13:01
 * Description: 商品信息dao层
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 查询所有在在架的商品
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
