package com.learnings.designpatterns.creational.registry;

import com.learnings.designpatterns.creational.prototype.BackGroundObject;
import com.learnings.designpatterns.creational.prototype.BackgroundObjectType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BackGroundObjectRegistryTest {

    @Test
    public void insertObject(){

        BackGroundObjectRegistry registry = new BackGroundObjectRegistry();
        BackGroundObject backGroundObject =
                new BackGroundObject(10,20,100,300, BackgroundObjectType.TREE);
        registry.registerBackgroundObject(backGroundObject);
        assertNotNull(registry);
    }

    @Test
    public void getObject(){
        BackGroundObjectRegistry registry = new BackGroundObjectRegistry();
        BackGroundObject backGroundObject =
                new BackGroundObject(10,20,100,300, BackgroundObjectType.TREE);
        registry.registerBackgroundObject(backGroundObject);
        assertNotNull(registry);
        BackGroundObject backGroundObject1 =registry.getBackgroundObject(BackgroundObjectType.TREE);
        assertEquals(backGroundObject1.getX(),backGroundObject.getX());
        assertNotNull(backGroundObject1);
    }

}
