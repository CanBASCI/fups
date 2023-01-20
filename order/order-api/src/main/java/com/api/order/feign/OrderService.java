package com.api.order.feign;

import com.api.order.dto.response.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "order-service",
        url = "${order-service.server}"
)
public interface OrderService {
    @GetMapping("api/order/getOrders")
    List<OrderDto> getOrders();
}
