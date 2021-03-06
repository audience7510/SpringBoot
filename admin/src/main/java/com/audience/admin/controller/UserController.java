package com.audience.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.audience.admin.model.User;
import com.audience.admin.queue.TestQueueSend;
import com.audience.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/audience")
public class UserController {

    @Reference
    UserService userService;

    @Autowired
    com.audience.admin.service.UserService adminUserService;

    @Autowired
    private TestQueueSend testQueueSend;
    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping("/setUser")
    @ResponseBody
    public String setUser(String userName){
//        User user = userService.getUser(userName);
//        User user = new User();
//        user.setName("heihei");
//        user.setAge(18);
        User user = new User();
        user.setName("大熊");
        user.setAge(18);
        redisTemplate.opsForValue().set(userName,user);
        return "ok";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(String userName){
        User user = adminUserService.getUser(userName);
        return user;
    }

    @RequestMapping("/getUser2")
    @ResponseBody
    public User getUser2(String userName){
        User user = adminUserService.getUser2(userName);
        return user;
    }

    @GetMapping("/getQueueConnect")
    public void getQueueConnect(String msg){
        testQueueSend.send(msg);
    }
}
