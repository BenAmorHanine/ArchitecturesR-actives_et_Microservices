package com.shopflow.orders;

public class Item {
    private final double price;
    private final int qty;

    public Item(double price, int qty) {
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() { return price; }
    public int getQty()      { return qty; }
}