package com.vandoris.springbootmall.service;

import com.vandoris.springbootmall.dto.ProductRequest;
import com.vandoris.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
