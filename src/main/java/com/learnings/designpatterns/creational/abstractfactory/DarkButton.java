package com.learnings.designpatterns.creational.abstractfactory;

import lombok.Getter;

//step 2 create concrete product class
@Getter
public class DarkButton extends Button {

    private final Double radius;
    public DarkButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }
    @Override
    public void onClick() {
    }
    @Override
    public void render() {
    }
}
