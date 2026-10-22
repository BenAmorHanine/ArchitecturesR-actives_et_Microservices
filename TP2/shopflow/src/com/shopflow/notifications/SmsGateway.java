package com.shopflow.notifications;

public class SmsGateway {
    public void send(String to, String message) {
        System.out.println("[SMS] to " + to + " : " + message);
    }
}