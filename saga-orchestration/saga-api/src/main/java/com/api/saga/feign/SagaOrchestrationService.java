package com.api.saga.feign;

import com.api.saga.dto.request.CreateOrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "saga-orchestration-service",
        url = "${saga-orchestration-service.server}"
)
public interface SagaOrchestrationService {

    @PostMapping("api/saga-orchestration/createOrder")
    void starCreateOrder(@RequestBody CreateOrderDto createOrderDto);
}
