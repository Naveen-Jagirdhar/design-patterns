package com.learnings.designpatterns.structural.adapter.external;

public class PayUApi {

    public void makePayment(Long Id  , Double amount){
        System.out.println("Razor pay payment");
    }

    public PayUStatus checkStatus(Long id) {
        return PayUStatus.SUCCESS;
    }
}
