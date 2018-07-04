package com.rqhua.demo.dagger2.module;

import com.rqhua.demo.dagger2.bean.Bean;
import com.rqhua.demo.dagger2.bean.CChildBean;
import com.rqhua.demo.dagger2.bean.ChildBean;
import dagger.Module;
import dagger.Provides;

import java.util.ArrayList;
import java.util.List;

@Module
public class BeanModule {

    @Provides
    public List<Bean> provideBean() {
        List<Bean> beans = new ArrayList<Bean>();
        beans.add(new Bean(18, "Jack"));
        beans.add(new Bean(18, "Mack"));
        beans.add(new Bean(18, "Hello"));
        return beans;
    }

    @Provides
    public ChildBean provideChildBean(List<Bean> beans) {
        return new ChildBean(beans);
    }

    @Provides
    public CChildBean provideCChildbean() {
        return new CChildBean(20, "HAHA");
    }


}
