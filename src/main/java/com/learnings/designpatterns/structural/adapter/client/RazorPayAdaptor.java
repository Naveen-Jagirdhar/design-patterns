package com.learnings.designpatterns.structural.adapter.client;

import com.learnings.designpatterns.structural.adapter.external.RazorPayApi;
import com.learnings.designpatterns.structural.adapter.external.RazorPayStatus;
import com.learnings.designpatterns.structural.adapter.provider.PaymentProvider;
import com.learnings.designpatterns.structural.adapter.provider.PaymentStatus;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RazorPayAdaptor implements PaymentProvider {

    private RazorPayApi razorPayApi;

    public RazorPayAdaptor(RazorPayApi razorPayApi) {
        this.razorPayApi = razorPayApi;
    }

    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        razorPayApi.pay(id,name,email,amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayStatus status = razorPayApi.checkStatus(id);
        switch (status){
            case OK -> {
                return PaymentStatus.SUCCESS;
            }
            case FAILED -> {
                return PaymentStatus.FAIL;
            }
        }
        throw new IllegalArgumentException("Invalid status:" + status);
    }
}
