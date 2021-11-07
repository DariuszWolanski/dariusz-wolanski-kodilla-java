package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{

    @Override
    public boolean order(Customer customer, Product product) {
        System.out.println("Ordered clothes for: " + customer.getNameCustomer()
                + " like as " + product.getNameProduct() + "."+ '\n');

        return true;
    }
}
