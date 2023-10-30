package com.learnings.designpatterns.structural.adapter.client;

import com.learnings.designpatterns.structural.adapter.external.PayUApi;
import com.learnings.designpatterns.structural.adapter.external.PayUStatus;
import com.learnings.designpatterns.structural.adapter.external.RazorPayStatus;
import com.learnings.designpatterns.structural.adapter.provider.PaymentProvider;
import com.learnings.designpatterns.structural.adapter.provider.PaymentStatus;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PayUAdaptor implements PaymentProvider {

    private PayUApi payUApi;

    public PayUAdaptor(PayUApi payUApi) {
        this.payUApi = payUApi;
    }

    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        payUApi.makePayment(id,amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUStatus status = payUApi.checkStatus(id);
        switch (status){
            case SUCCESS -> {
                return PaymentStatus.SUCCESS;
            }
            case FAILUR -> {
                return PaymentStatus.FAIL;
            }
        }
        throw new IllegalArgumentException("Invalid status:" + status);
    }
}
