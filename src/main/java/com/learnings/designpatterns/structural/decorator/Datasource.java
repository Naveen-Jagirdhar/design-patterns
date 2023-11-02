package com.learnings.designpatterns.structural.decorator;

//step1 create product interface
public interface Datasource {

    String read();
    void write(String value);

}
