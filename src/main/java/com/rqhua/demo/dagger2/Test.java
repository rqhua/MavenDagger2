package com.rqhua.demo.dagger2;

import com.rqhua.demo.dagger2.bean.Bean;
import com.rqhua.demo.dagger2.bean.CChildBean;
import com.rqhua.demo.dagger2.bean.ChildBean;
import com.rqhua.demo.dagger2.bean.User;
import com.rqhua.demo.dagger2.component.BeanComponent;
import com.rqhua.demo.dagger2.component.DaggerBeanComponent;
import com.rqhua.demo.dagger2.module.BeanModule;
import com.rqhua.demo.dagger2.module.UserModule;

import javax.inject.Inject;
import java.util.List;

public class Test {
    @Inject
    List<Bean> beans;

    @Inject
    ChildBean childBean;

    @Inject
    CChildBean cChildBean;

    @Inject
    User user;

    public Test() {
        BeanComponent beanComponent = DaggerBeanComponent
                .create();
//                .builder()
//                .beanModule(new BeanModule())
//                .userModule(new UserModule())
//                .build();
        beanComponent.inject(this);
    }

    public void test() {
        System.out.println(beans.toString());
        System.out.println(childBean.toString());
        System.out.println(cChildBean.toString());
        System.out.println(user.toString());

    }
}
