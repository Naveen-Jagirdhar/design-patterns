package com.learnings.designpatterns.creational.singleton;

import com.learnings.designpatterns.creational.singleton.ConnectionPool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ConnectionPoolTest {

    @Test
    public void connectionPoolInstanceTest(){
        ConnectionPool pool = ConnectionPool.getInstance();
        ConnectionPool pool1 = ConnectionPool.getInstance();
        assertSame(pool,pool1);
    }
}
