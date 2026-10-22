package com.shopflow.orders;

public class OrderProcessor {
    private final DiscountPolicy discount;
    private final PaymentMethod payment;
    private final OrderRepository repository;
    private final Notifier notifier;

    public OrderProcessor(DiscountPolicy discount, PaymentMethod payment,
                          OrderRepository repository, Notifier notifier) {
        this.discount = discount;
        this.payment = payment;
        this.repository = repository;
        this.notifier = notifier;
    }

    public double process(Order order) {
        double total = discount.apply(order);
        payment.pay(total);
        repository.save(order, total);
        notifier.notify(order, "Commande validée");
        return total;
    }
}