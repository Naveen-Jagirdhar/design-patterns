package com.learnings.designpatterns.creational.abstractfactory;

import lombok.Getter;

@Getter
public class LightButton extends Button {

    private final Double length;

    public LightButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void onClick() {

    }

    @Override
    public void render() {

    }
}
