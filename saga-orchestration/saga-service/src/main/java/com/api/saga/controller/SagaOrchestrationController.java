package com.api.saga.controller;

import com.api.saga.dto.request.CreateOrderDto;
import com.api.saga.feign.SagaOrchestrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SagaOrchestrationController implements SagaOrchestrationService {
    @Override
    public void starCreateOrder(CreateOrderDto createOrderDto) {

    }
}
