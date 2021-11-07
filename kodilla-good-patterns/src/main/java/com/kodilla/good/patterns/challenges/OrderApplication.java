package com.kodilla.good.patterns.challenges;

public class OrderApplication {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

//        MailService mailService = new MailService();
//        ProductOrderRepository orderRepositoryForClothes = new ProductOrderRepository();
//        ProductOrderService orderServiceForClothes = new ProductOrderService();

        OrderProcessor orderProcessorForClothes = new OrderProcessor(new MailService(),
                new ProductOrderService(), new ProductOrderRepository());

        orderProcessorForClothes.process(orderRequest);


    }

}
