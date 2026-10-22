package com.shopflow.notifications;

import com.shopflow.orders.Notifier;
import com.shopflow.orders.Order;

public class SmsNotifier implements Notifier {
    private final SmsGateway gateway;

    public SmsNotifier(SmsGateway gateway) { this.gateway = gateway; }

    @Override
    public void notify(Order order, String message) {
        gateway.send(order.getPhone(), message);
    }
}