package com.api.order.controller;

import com.api.order.dto.response.OrderDto;
import com.api.order.feign.OrderService;
import com.api.order.operation.OrderOperation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderController implements OrderService {
    @Autowired
    OrderOperation orderOperation;
    @Override
    public List<OrderDto> getOrders() {
        return orderOperation.getOrders();
    }
}
