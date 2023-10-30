package com.learnings.designpatterns.structural.adapter.external;

public class RazorPayApi {

    public void pay(Long Id , String name , String email , Double amount){
        System.out.println("Razor pay payment");
    }

    public RazorPayStatus checkStatus(Long id) {
        return RazorPayStatus.OK;
    }
}
