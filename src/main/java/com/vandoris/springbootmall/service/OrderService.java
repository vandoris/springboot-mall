package com.vandoris.springbootmall.service;

import com.vandoris.springbootmall.dto.CreateOrderRequest;
import com.vandoris.springbootmall.dto.OrderQueryParams;
import com.vandoris.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
