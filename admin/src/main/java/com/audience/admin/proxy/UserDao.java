package com.audience.admin.proxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {

        System.out.println("save方法执行了");
    }
}
