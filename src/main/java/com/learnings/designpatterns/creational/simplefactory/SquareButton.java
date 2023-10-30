package com.learnings.designpatterns.creational.simplefactory;

import lombok.Getter;

@Getter
public class SquareButton extends Button{

    private final Double length;

    public SquareButton(Double border, Double length) {
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
