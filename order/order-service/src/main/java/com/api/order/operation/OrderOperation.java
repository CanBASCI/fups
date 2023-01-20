package com.api.order.operation;

import com.api.order.data.IOrderRepository;
import com.api.order.data.mapper.IOrderMapper;
import com.api.order.dto.response.OrderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderOperation {
    private final static Logger logger = LoggerFactory.getLogger(OrderOperation.class);
    @Autowired
    IOrderMapper orderMapper;
    @Autowired
    IOrderRepository orderRepository;

    public List<OrderDto> getOrders() {
        logger.info("OrderOperation -> getOrders");
        return orderMapper.toDtos(orderRepository.findAll());
    }
}
