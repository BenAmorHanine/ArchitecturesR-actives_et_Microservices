package com.shopflow.ui;

import com.shopflow.billing.*;
import com.shopflow.notifications.*;
import com.shopflow.orders.*;
import com.shopflow.persistence.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(
                List.of(new Item(10.0, 2), new Item(5.0, 4)),
                "VIP", "farah@example.com", "+21600000000", "C-001");

        OrderRepository repo =
                new MySqlOrderRepository(new MySqlDatabase("jdbc:mysql://localhost/shop"));
        DiscountPolicy discount = new VipDiscountPolicy();

        // Scénario 1 : CB + email
        OrderProcessor p1 = new OrderProcessor(discount, new CreditCardPayment(),
                repo, new EmailNotifier(new SmtpClient()));
        System.out.println("Total = " + p1.process(order));

        // Scénario 2 : PayPal + SMS
        OrderProcessor p2 = new OrderProcessor(discount, new PaypalPayment(),
                repo, new SmsNotifier(new SmsGateway()));
        System.out.println("Total = " + p2.process(order));

        // Scénario 3 : Cash + email
        OrderProcessor p3 = new OrderProcessor(discount, new CashPayment(),
                repo, new EmailNotifier(new SmtpClient()));
        System.out.println("Total = " + p3.process(order));

        // Scénario 4 (1.4) : Crypto + Push, OrderProcessor intact
        OrderProcessor p4 = new OrderProcessor(discount, new CryptoPayment(),
                repo, new PushNotifier(new PushGateway()));
        System.out.println("Total = " + p4.process(order));
    }
}