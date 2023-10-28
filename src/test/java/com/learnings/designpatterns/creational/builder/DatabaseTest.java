package com.learnings.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseTest {

    @Test
    public void dataBaseTest(){
        Database mySqldataBase = Database.builder().userName("root").password("root-root").url("url")
                .type(DatabaseType.MYSQL).build();
        assertNotNull(mySqldataBase);
        assertEquals("root",mySqldataBase.getUsername());
        assertEquals(DatabaseType.MYSQL,mySqldataBase.getType());
    }
}
