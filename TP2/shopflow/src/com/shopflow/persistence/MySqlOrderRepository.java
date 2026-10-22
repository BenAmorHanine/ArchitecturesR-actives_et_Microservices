package com.shopflow.persistence;

import com.shopflow.orders.Order;
import com.shopflow.orders.OrderRepository;

public class MySqlOrderRepository implements OrderRepository {
    private final MySqlDatabase db;

    public MySqlOrderRepository(MySqlDatabase db) { this.db = db; }

    @Override
    public void save(Order order, double total) {
        db.save(order, total);
    }
}