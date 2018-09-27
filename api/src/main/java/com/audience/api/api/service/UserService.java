package com.audience.api.api.service;

import com.audience.api.api.model.User;

public interface UserService {
    User getUser(String userName);

    void saveUser(User user);

    void updateUser(User user);

}
