// src/com/shopflow/billing/CreditCardPayment.java
package com.shopflow.billing;

import com.shopflow.orders.PaymentMethod;

public class CreditCardPayment implements PaymentMethod, Refundable, RecurringCharger {
    @Override
    public void pay(double amount) {
        System.out.println("Débit CB : " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Remboursement CB : " + amount);
    }

    @Override
    public void recurringCharge(double amount) {
        System.out.println("Abonnement CB : " + amount);
    }
}