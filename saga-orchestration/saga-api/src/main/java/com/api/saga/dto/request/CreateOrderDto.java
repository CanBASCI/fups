package com.api.saga.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class CreateOrderDto {
    private String orderName;
    private Integer orderCount;
}
