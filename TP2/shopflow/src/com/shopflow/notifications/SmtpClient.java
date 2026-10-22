package com.shopflow.notifications;

public class SmtpClient {
    public void send(String to, String message) {
        System.out.println("[EMAIL] to " + to + " : " + message);
    }
}