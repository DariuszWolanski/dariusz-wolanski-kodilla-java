package com.kodilla.good.patterns.challenges;

public class OrderProcessor {


    private OrderInformationService orderInformationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(OrderInformationService orderInformationService, OrderService orderService, OrderRepository orderRepository) {

        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct());
        if (isOrdered) {
            orderInformationService.sendIntormation(orderRequest.getCustomer());
            orderRepository.createInfomatiomAboutRegisteredOrder(orderRequest.getCustomer(),
                    orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }

    }
}
