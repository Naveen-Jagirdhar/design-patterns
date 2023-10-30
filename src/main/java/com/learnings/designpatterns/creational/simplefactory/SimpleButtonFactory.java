package com.learnings.designpatterns.creational.simplefactory;

public class SimpleButtonFactory {
    //step 3 create a static factory method
    public static Button createButton(ScreenSize screenSize, Double border , Double radius , Double length){
        switch (screenSize){
            case MOBILE ,TABLET-> {
                return new RoundButton(border,radius);
            }
            case DESKTOP -> {
                return new SquareButton(border, length);
            }
        }
        throw new IllegalArgumentException("Invalid type:"+screenSize);
    }
}