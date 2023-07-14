package com.vandoris.springbootmall.service.impl;

import com.vandoris.springbootmall.dao.ProductDao;
import com.vandoris.springbootmall.model.Product;
import com.vandoris.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
