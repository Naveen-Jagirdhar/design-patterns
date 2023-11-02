package com.learnings.designpatterns.structural;

import com.learnings.designpatterns.structural.flyweight.Bullet;
import com.learnings.designpatterns.structural.flyweight.FlyingBullet;
import org.junit.jupiter.api.Test;

public class FlyWeightTest {

    @Test
    public void createFlyWeight() {
        Bullet bullet = new Bullet("IMAGE");
        FlyingBullet flyingBullet = new FlyingBullet(10.0,10.0,10.0,
                10.0,10.0,10.0,bullet);
        FlyingBullet flyingBullet1 = new FlyingBullet(0.0,0.0,0.0,
                0.0,0.0,0.0,bullet);
    }
}
