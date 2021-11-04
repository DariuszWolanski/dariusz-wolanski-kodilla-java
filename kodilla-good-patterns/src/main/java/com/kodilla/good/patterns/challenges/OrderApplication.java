package com.kodilla.good.patterns.challenges;

public class OrderApplication {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

//        MailService mailService = new MailService();
//        OrderRepositoryForClothes orderRepositoryForClothes = new OrderRepositoryForClothes();
//        OrderServiceForClothes orderServiceForClothes = new OrderServiceForClothes();

        OrderProcessor orderProcessorForClothes = new OrderProcessor(new MailService(),
                new OrderServiceForClothes(), new OrderRepositoryForClothes());

        orderProcessorForClothes.process(orderRequest);


    }

}
