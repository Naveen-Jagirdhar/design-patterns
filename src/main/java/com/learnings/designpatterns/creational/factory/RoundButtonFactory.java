package com.learnings.designpatterns.creational.factory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public class RoundButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(ScreenSize screenSize, Double radius, Double border, Double lenth) {
        return new RoundButton(radius,border);
    }
}
