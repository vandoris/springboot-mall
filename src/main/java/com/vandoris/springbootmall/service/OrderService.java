package com.vandoris.springbootmall.service;

import com.vandoris.springbootmall.dto.CreateOrderRequest;
import com.vandoris.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
