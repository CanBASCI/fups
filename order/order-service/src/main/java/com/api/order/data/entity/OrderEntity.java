package com.api.order.data.entity;

import com.api.order.data.entity.util.BaseEntity;
import com.api.order.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    @Column(name="name")
    private String name;
    @Column(name="count")
    private Integer count;
    @Column(name="status")
    private OrderStatus status;
}
