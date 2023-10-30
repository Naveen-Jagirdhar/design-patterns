package com.learnings.designpatterns.creational.abstractfactory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(ScreenSize screenSize, Double radius, Double border, Double length) {
        return new DarkButton(border,length);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
}
