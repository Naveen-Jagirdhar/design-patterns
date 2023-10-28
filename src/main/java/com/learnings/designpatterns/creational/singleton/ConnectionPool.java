package com.learnings.designpatterns.creational.singleton;

public class ConnectionPool {

    //step 3 create a Global static variable
    private static ConnectionPool CONNECTION_POOL = null;
    //step 1 create a private constructor
    private ConnectionPool() {
    }

    //step 2 create a static instance() method
    public static ConnectionPool getInstance(){
        //step 4 implement static method & check if NULL or NOT
        //step 5 add synchronized to ensure thread safety
        if (null == CONNECTION_POOL) {
            synchronized (ConnectionPool.class) {
                // check again in synchronized to ensure safety
                if (null == CONNECTION_POOL) CONNECTION_POOL = new ConnectionPool();
            }
        }
        return CONNECTION_POOL;
    }
}
