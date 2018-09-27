package com.audience.api.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.audience.api.api.mapper.UserMapper;
import com.audience.api.api.model.User;
import com.audience.api.api.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;

import java.util.HashMap;
import java.util.Map;

@Service
@CacheConfig
public class UserServiceImpl implements UserService {

    private Map<String, User> map = new HashMap<String, User>();

    private Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 模拟数据库查询
     * @return
     */
    @Override
    public User getUser(String userName) {
//        User user = userMapper.getUser();
        User user = map.get(userName);
        return user;
    }

    /**
     * 模拟数据库保存
     */
    @Override
    public void saveUser(User user) {
        map.put(user.getName(),user);
        logger.info("=====>数据库插入成功");
    }

    /**
     *模拟数据库修改
     */
    @Override
    public void updateUser(User user) {
        User mapUser = map.get(user.getName());
        mapUser.setAge(user.getAge());
        map.put(user.getName(),mapUser);
    }
}
