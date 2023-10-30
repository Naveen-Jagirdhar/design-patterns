package com.learnings.designpatterns.creational.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest {

    @Test
    public void testRoundButton(){
        Button button =
                SimpleButtonFactory.createButton(ScreenSize.MOBILE,10.0,12.0,15.0);
        assertTrue(button instanceof RoundButton);
    }

    @Test
    public void testSquareButton(){
        Button button =
                SimpleButtonFactory.createButton(ScreenSize.DESKTOP,10.0,12.0,15.0);
        assertTrue(button instanceof SquareButton);
    }
}
