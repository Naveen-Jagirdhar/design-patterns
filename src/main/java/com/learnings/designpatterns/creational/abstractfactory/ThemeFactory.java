package com.learnings.designpatterns.creational.abstractfactory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public interface ThemeFactory {

    Button createButton(ScreenSize screenSize , Double radius , Double border , Double length);

    Radio createRadio();
}
