package com.shopflow.orders;

import java.util.List;

public class Order {
    private final List<Item> items;
    private final String customerType;
    private final String email;
    private final String phone;
    private final String customerId;

    public Order(List<Item> items, String customerType,
                 String email, String phone, String customerId) {
        this.items = items;
        this.customerType = customerType;
        this.email = email;
        this.phone = phone;
        this.customerId = customerId;
    }

    public List<Item> getItems()  { return items; }
    public String getCustomerType() { return customerType; }
    public String getEmail()      { return email; }
    public String getPhone()      { return phone; }
    public String getCustomerId() { return customerId; }

    public double getSubtotal() {
        double total = 0;
        for (Item i : items) total += i.getPrice() * i.getQty();
        return total;
    }
}