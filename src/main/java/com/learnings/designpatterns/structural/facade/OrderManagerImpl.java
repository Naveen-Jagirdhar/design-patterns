package com.learnings.designpatterns.structural.facade;

public class OrderManagerImpl implements OrderManager{

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private InvoiceService invoiceService;
    private EmailService emailService;

    @Override
    public void checkOut(Long orderId) {

        //check for inventory
        if (!inventoryService.isPresent(orderId)){
            throw new RuntimeException("Stock unavailable:"+ orderId);
        }
        //payment gateway
        paymentService.processPayment(orderId);
        //create invoice
        invoiceService.createInvoice(orderId);
        //send email
        emailService.sendEmail(orderId);
    }
}
