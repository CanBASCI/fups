package com.api.order.dto.response;

import com.api.order.dto.util.BaseDto;
import com.api.order.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class OrderDto extends BaseDto {
    private UUID id;
    private String name;
    private Integer count;
    private OrderStatus status;
}
