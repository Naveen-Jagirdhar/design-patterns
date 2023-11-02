package com.learnings.designpatterns.structural.facade;

public class EmailService {

    public void sendEmail(Long orderId){
        System.out.println("Email processed successfully"+orderId);
    }
}
