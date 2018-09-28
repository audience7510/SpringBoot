package com.audience.admin.admin.service.impl;

import com.audience.admin.admin.model.User;
import com.audience.admin.admin.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(value = "aaa",keyGenerator="SimpleKey")
    public User getUser(String userName) {
        User user = new User();
        user.setName("bbb");
        user.setAge(222);
        System.out.println("=========>新创建的对象返回了");
        return user;
    }

    @Override
    @Cacheable(value = "ccc",keyGenerator="SimpleKey",cacheManager = "cacheManager315")
    public User getUser2(String userName) {
        User user = new User();
        user.setName("ccc");
        user.setAge(333);
        System.out.println("=========>新创建的对象返回了2");
        return user;
    }
    /**
     * 笔记：注解@Cacheable(value = "ccc",keyGenerator="SimpleKey") 它的value值会被缓存到redis中
     * 注意，这个value是以 key-value的形式存储的（其实是有序集合的形式来存储，太难，没看懂）
     * key是 value值~keys(也就是 ccc~keys)
     * value是 keyGenerator的生成规则  也就是被缓存的对象的key值！
     * 通过value值拿到被缓存对象的key值，通过缓存对象的key值拿到缓存对象
     */
}
