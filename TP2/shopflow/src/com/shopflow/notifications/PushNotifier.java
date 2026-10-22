package com.shopflow.notifications;

import com.shopflow.orders.Notifier;
import com.shopflow.orders.Order;

public class PushNotifier implements Notifier {
    private final PushGateway gateway;

    public PushNotifier(PushGateway gateway) { this.gateway = gateway; }

    @Override
    public void notify(Order order, String message) {
        gateway.send(order.getCustomerId(), message);
    }
}