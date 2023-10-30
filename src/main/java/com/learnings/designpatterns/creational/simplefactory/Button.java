package com.learnings.designpatterns.creational.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

//step 1 create common product interface
@AllArgsConstructor
@Getter
public abstract class Button {

    private Double border;

    public abstract void onClick();
    public abstract void render();
}
