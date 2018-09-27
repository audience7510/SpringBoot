package com.audience.api.api.mapper;

import com.audience.api.api.model.User;

public class UserMapper {
    public User getUser(){
        User user = new User();
        user.setName("大熊");
        user.setAge(18);
        return user;
    }
}
