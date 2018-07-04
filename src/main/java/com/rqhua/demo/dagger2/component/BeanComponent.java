package com.rqhua.demo.dagger2.component;

import com.rqhua.demo.dagger2.Main;
import com.rqhua.demo.dagger2.Test;
import com.rqhua.demo.dagger2.module.BeanModule;
import com.rqhua.demo.dagger2.module.UserModule;
import dagger.Component;

@Component(modules = {BeanModule.class, UserModule.class})
public interface BeanComponent {
    void inject(Test test);
}
