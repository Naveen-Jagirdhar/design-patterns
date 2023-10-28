package com.learnings.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BackGroundObjectTest {

    @Test
    public void cloneObjectTest(){
        BackGroundObject bgObject = new BackGroundObject(10,20,30,40,BackgroundObjectType.TREE);
        BackGroundObject bgObject1 = bgObject.clone();

        assertEquals(bgObject.getX(),bgObject1.getX());
        assertNotNull(bgObject);
    }
}
