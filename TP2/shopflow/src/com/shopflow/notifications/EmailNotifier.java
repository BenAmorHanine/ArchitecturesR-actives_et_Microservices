package com.shopflow.notifications;

import com.shopflow.orders.Notifier;
import com.shopflow.orders.Order;

public class EmailNotifier implements Notifier {
    private final SmtpClient client;

    public EmailNotifier(SmtpClient client) { this.client = client; }

    @Override
    public void notify(Order order, String message) {
        client.send(order.getEmail(), message);
    }
}