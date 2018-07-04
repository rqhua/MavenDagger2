package com.rqhua.demo.dagger2.bean;

import javax.inject.Inject;

public class CChildBean extends Bean {
    public CChildBean(int age, String userName) {
        super(age, userName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
