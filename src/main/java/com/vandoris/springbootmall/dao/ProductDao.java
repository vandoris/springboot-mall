package com.vandoris.springbootmall.dao;

import com.vandoris.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
