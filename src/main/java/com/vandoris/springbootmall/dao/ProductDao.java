package com.vandoris.springbootmall.dao;

import com.vandoris.springbootmall.constant.ProductCategory;
import com.vandoris.springbootmall.dto.ProductRequest;
import com.vandoris.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
