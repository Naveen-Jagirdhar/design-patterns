package com.learnings.designpatterns.behavioural.observer;

public class BitcoinTracker {

    private Bitcoin bitcoin;

    //external api which sets price
    public void setPrice(Double price){
        bitcoin.setPrice(price);
    }
}
