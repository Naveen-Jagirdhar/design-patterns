package com.learnings.designpatterns.creational.abstractfactory;

import com.learnings.designpatterns.creational.simplefactory.ScreenSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void testDarkFactoryItems(){
        ThemeFactory themeFactory = new DarkThemeFactory();
        Button button = themeFactory.createButton(ScreenSize.MOBILE,10.0,10.0,10.0);
        assertTrue(button instanceof DarkButton);

        Radio radio = themeFactory.createRadio();
        assertTrue(radio instanceof DarkRadio);
    }

    @Test
    public void testLightFactoryItems(){
        ThemeFactory themeFactory = new LightThemeFactory();
        Button button = themeFactory.createButton(ScreenSize.MOBILE,10.0,10.0,10.0);
        assertTrue(button instanceof LightButton);

        Radio radio = themeFactory.createRadio();
        assertTrue(radio instanceof LightRadio);
    }
}
