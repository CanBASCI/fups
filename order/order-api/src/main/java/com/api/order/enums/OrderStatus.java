package com.api.order.enums;

public enum OrderStatus {
    PROCESSING(1),
    DONE(2),
    FAILED(3);
    private final int value;
    OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
