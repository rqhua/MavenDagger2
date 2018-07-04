package com.rqhua.demo.dagger2.module;

import com.rqhua.demo.dagger2.bean.Bean;
import com.rqhua.demo.dagger2.bean.User;
import dagger.Module;
import dagger.Provides;

import java.util.ArrayList;
import java.util.List;

@Module
public class UserModule {

    @Provides
    public User provideUser() {
        return new User("UserModule");
    }

}
