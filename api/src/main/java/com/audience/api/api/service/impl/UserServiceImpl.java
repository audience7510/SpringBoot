package com.audience.api.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.audience.api.api.model.User;
import com.audience.api.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user = new User();
        user.setName("heihei");
        user.setAge(18);
        return user;
    }
}
