package com.learnings.designpatterns.structural.flyweight;

//step 2 Extrinsic state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlyingBullet {

    private Double x,y,z,radius,weight;
    private double direction;

    //step 3 add has a relation of instinsic state
    private Bullet bullet;
}
