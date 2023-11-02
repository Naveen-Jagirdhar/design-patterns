package com.learnings.designpatterns.structural.decorator;

//step2 concreate product class
public class FileDataSource implements Datasource{
    @Override
    public String read() {
        return "FileDataSource";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
