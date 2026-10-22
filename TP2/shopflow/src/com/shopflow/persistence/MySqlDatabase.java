package com.shopflow.persistence;

import com.shopflow.orders.Order;

public class MySqlDatabase {
    private final String url;

    public MySqlDatabase(String url) { this.url = url; }

    public void save(Order order, double total) {
        System.out.println("[MySQL " + url + "] commande " + order.getCustomerId()
                + " sauvegardée, total=" + total);
    }
}