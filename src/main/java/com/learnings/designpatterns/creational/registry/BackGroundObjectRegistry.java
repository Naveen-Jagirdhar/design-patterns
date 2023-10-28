package com.learnings.designpatterns.creational.registry;

import com.learnings.designpatterns.creational.prototype.BackGroundObject;
import com.learnings.designpatterns.creational.prototype.BackgroundObjectType;

import java.util.HashMap;
import java.util.Map;

public class BackGroundObjectRegistry {

    private Map<BackgroundObjectType, BackGroundObject> map = new HashMap<>();

    public void registerBackgroundObject(BackGroundObject backGroundObject){
        map.put(backGroundObject.getBackgroundObjectType(),backGroundObject);
    }

    public BackGroundObject getBackgroundObject(BackgroundObjectType backgroundObjectType){
        return map.get(backgroundObjectType);
    }

}
