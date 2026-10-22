package com.shopflow.orders;

public interface DiscountPolicy {
    double apply(Order order);
}