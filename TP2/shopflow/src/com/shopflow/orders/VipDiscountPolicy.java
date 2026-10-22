package com.shopflow.orders;

public class VipDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(Order order) {
        double subtotal = order.getSubtotal();
        return "VIP".equals(order.getCustomerType()) ? subtotal * 0.9 : subtotal;
    }
}