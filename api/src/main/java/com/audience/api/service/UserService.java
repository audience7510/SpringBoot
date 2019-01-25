package com.audience.api.service;

import com.audience.api.model.User;

public interface UserService {
    User getUser(String userName);

    void saveUser(User user);

    void updateUser(User user);

}
