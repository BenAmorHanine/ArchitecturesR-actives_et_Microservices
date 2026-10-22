package com.shopflow.orders;

public interface OrderRepository {
    void save(Order order, double total);
}