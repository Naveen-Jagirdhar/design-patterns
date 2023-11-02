package com.learnings.designpatterns.structural.facade;

public class OrderProcessorImpl implements OrderProcessor{

    private OrderManager orderManager;
    @Override
    public void process(Long orderId) {
        orderManager.checkOut(orderId);
    }
}
