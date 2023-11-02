package com.learnings.designpatterns.behavioural.observer;


//step1 create interface for publisher & registry
public abstract class Publisher {

    public void publish(Double price){}
    public void addConsumer(Consumer consumer){}
    public void removeConsumer(Consumer consumer) {}
}
