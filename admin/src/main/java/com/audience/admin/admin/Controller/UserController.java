package com.audience.admin.admin.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.audience.api.api.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/audience")
public class UserController {

    @Reference
    UserService userService;

    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(String userName){
//        User user = userService.getUser(userName);
//        User user = new User();
//        user.setName("heihei");
//        user.setAge(18);
        redisTemplate.opsForValue().set(userName,1111323232);
        return "ok";
    }
}
