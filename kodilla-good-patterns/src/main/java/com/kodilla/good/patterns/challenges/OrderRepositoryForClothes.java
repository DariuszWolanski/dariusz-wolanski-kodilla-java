package com.kodilla.good.patterns.challenges;

public class OrderRepositoryForClothes implements OrderRepository{
    @Override
    public void createInfomatiomAboutRegisteredOrder(Customer customer, Product product) {
        System.out.println("Order registration:" +'\n' + customer + " ordered " + product + ".");
    }
}
