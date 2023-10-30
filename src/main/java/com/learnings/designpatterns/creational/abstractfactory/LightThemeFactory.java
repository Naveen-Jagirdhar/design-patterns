package com.learnings.designpatterns.creational.abstractfactory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(ScreenSize screenSize, Double radius, Double border, Double length) {
        return new LightButton(radius,border);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}
