package com.audience.admin.admin.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.audience.api.api.model.User;
import com.audience.api.api.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/audience")
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        User user = userService.getUser();
//        User user = new User();
//        user.setName("heihei");
//        user.setAge(18);
        return user;
    }
}
