package com.learnings.designpatterns.creational.factory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;

public interface ButtonFactory {

    //step 3 factory interface
    Button createButton(ScreenSize screenSize, Double radius , Double border , Double length);
}
