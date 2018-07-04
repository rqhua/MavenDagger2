package com.rqhua.demo.dagger2.bean;

import javax.inject.Inject;

public class Bean {
    private int age;
    private String userName;

    public Bean(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                '}';
    }
}