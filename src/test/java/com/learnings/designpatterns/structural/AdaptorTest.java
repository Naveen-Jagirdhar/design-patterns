package com.learnings.designpatterns.structural;

import com.learnings.designpatterns.structural.adapter.client.PayUAdaptor;
import com.learnings.designpatterns.structural.adapter.client.RazorPayAdaptor;
import com.learnings.designpatterns.structural.adapter.provider.PaymentProvider;
import org.junit.jupiter.api.Test;


public class AdaptorTest {

    @Test
    public void testRazorPayTest(){
        PaymentProvider paymentProvider = new RazorPayAdaptor();
        paymentProvider.createPayment(1L,"Naveen","abc@gmail.com",42.5);

    }

    @Test
    public void testPayUTest() {
        PaymentProvider paymentProvider = new PayUAdaptor();
        paymentProvider.createPayment(1L,"Naveen","abc@gmail.com",42.5);
    }
}
