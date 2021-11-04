package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("John White", "Grizlli");
        Product productOrdered = new Product("jacket");

        return new OrderRequest(customer, productOrdered);
    }
}
