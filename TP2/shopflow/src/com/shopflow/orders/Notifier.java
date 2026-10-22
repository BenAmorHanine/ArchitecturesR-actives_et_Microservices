package com.shopflow.orders;

public interface Notifier {
    void notify(Order order, String message);
}