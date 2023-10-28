package com.learnings.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public class Database {

    private String username;
    private String password;
    private String url;
    private DatabaseType type;

    //step 4 create a static builder method returning DatabaseBuilder
    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    //step 1 create a static inner Builder class
    public static class DatabaseBuilder {

        //step 2 copy all variable from outer class
        private String username;
        private String password;
        private String url;
        private DatabaseType type;

        //step 3 create setters for the variables
        public DatabaseBuilder userName(String username) {
            this.username = username;
            return this;
        }

        public DatabaseBuilder password(String password) {
            this.password = password;
            return this;
        }

        public DatabaseBuilder url(String url) {
            this.url = url;
            return this;
        }

        public DatabaseBuilder type(DatabaseType type) {
            this.type = type;
            return this;
        }

        public Database build(){
            Database database = new Database();
            database.username = username;
            database.password = password;
            database.url = url;
            database.type = type;
            return database;
        }
    }
}
