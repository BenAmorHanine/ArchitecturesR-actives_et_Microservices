package com.shopflow.billing;

import com.shopflow.orders.PaymentMethod;

// Pas de RecurringCharger : le cash ne supporte pas les abonnements (LSP respecté)
public class CashPayment implements PaymentMethod, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Espèces : " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Remboursement espèces : " + amount);
    }
}