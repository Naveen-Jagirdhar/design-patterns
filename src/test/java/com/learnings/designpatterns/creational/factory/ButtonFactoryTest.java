package com.learnings.designpatterns.creational.factory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonFactoryTest {

    @Test
    public void testRoundButton(){
        ButtonFactory buttonFactory = new RoundButtonFactory();
        Button button = buttonFactory.createButton(ScreenSize.MOBILE,10.0,12.0,10.0);
        assertTrue(button instanceof RoundButton);
    }

    @Test
    public void testSquareButton(){
        ButtonFactory buttonFactory = new SquareButtonFactory();
        Button button = buttonFactory.createButton(ScreenSize.DESKTOP,10.0,12.0,10.0);
        assertTrue(button instanceof SquareButton);
    }
}
