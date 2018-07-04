package com.rqhua.demo.dagger2.bean;

import javax.inject.Inject;
import java.util.List;

public class ChildBean {
    List<Bean> bean;

    public ChildBean(List<Bean> bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "bean=" + bean +
                '}';
    }
}
