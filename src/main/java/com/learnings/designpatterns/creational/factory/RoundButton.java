package com.learnings.designpatterns.creational.factory;

import lombok.Getter;

//step 2 create concrete product class
@Getter
public class RoundButton extends Button {

    private final Double radius;
    public RoundButton(Double border, Double radius) {
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
