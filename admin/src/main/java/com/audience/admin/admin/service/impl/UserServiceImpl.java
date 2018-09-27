package com.audience.admin.admin.service.impl;

import com.audience.admin.admin.model.User;
import com.audience.admin.admin.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(value = "usercache",keyGenerator="SimpleKey")
    public User getUser(String userName) {
        User user = new User();
        user.setName("bbb");
        user.setAge(222);
        System.out.println("=========>新创建的对象返回了");
        return user;
    }
}
