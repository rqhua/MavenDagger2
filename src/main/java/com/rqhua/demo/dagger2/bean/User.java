package com.rqhua.demo.dagger2.bean;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserModule{" +
                "name='" + name + '\'' +
                '}';
    }
}
