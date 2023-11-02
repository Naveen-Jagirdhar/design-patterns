package com.learnings.designpatterns.structural;

import com.learnings.designpatterns.structural.decorator.Datasource;
import com.learnings.designpatterns.structural.decorator.FileDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    void testRead() {
        Datasource datasource = new FileDataSource();
        assertEquals("FileDataSource",datasource.read());
    }
}
