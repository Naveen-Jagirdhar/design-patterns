package com.learnings.designpatterns.structural.decorator;


import lombok.AllArgsConstructor;

//step 3 base decorator
@AllArgsConstructor
public abstract class BaseDecorator implements Datasource{
    protected Datasource nextLayer;
}
