package com.shopflow.notifications;

public class PushGateway {
    public void send(String customerId, String message) {
        System.out.println("[PUSH] to " + customerId + " : " + message);
    }
}