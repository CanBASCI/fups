package com.api.order.data.mapper;

import com.api.order.data.entity.OrderEntity;
import com.api.order.dto.response.OrderDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface IOrderMapper {
    OrderDto toDto(OrderEntity orderEntity);
    List<OrderDto> toDtos(List<OrderEntity> orderEntity);
}
