package com.learnings.designpatterns.creational.factory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public class SquareButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(ScreenSize screenSize, Double radius, Double border, Double length) {
        return new SquareButton(border,length);
    }
}
