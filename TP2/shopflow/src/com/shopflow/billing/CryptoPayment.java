package com.shopflow.billing;

import com.shopflow.orders.PaymentMethod;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Crypto : " + amount);
    }
}