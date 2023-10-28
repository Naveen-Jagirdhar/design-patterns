package com.learnings.designpatterns.creational.prototype;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BackGroundObject implements GraphicalObject{

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private BackgroundObjectType backgroundObjectType;
    @Setter(AccessLevel.NONE)
    private List<Integer> pixels = new ArrayList<>();

    public BackGroundObject(Integer x, Integer y, Integer width, Integer height,
                            BackgroundObjectType backgroundObjectType) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.backgroundObjectType = backgroundObjectType;
    }

    public BackGroundObject(Integer x, Integer y, Integer width, Integer height,
                            BackgroundObjectType backgroundObjectType, List<Integer> pixels) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.backgroundObjectType = backgroundObjectType;
        this.pixels = pixels;
    }

    @Override
    public BackGroundObject clone() {
        return new BackGroundObject(x,y,width,height,backgroundObjectType,pixels);
    }
}
