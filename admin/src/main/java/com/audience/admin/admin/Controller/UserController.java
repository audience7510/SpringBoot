package com.audience.admin.admin.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.audience.api.api.model.User;
import com.audience.api.api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/audience")
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        User user = userService.getUser();
        return user;
    }
}
