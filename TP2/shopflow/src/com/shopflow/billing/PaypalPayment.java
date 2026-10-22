package com.shopflow.billing;

import com.shopflow.orders.PaymentMethod;

public class PaypalPayment implements PaymentMethod, Refundable, RecurringCharger {
    @Override
    public void pay(double amount) {
        System.out.println("PayPal : " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Remboursement PayPal : " + amount);
    }

    @Override
    public void recurringCharge(double amount) {
        System.out.println("Abonnement PayPal : " + amount);
    }
}