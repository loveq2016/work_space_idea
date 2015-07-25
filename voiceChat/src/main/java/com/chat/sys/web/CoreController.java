package com.chat.sys.web;

import javax.annotation.Resource;

import com.chat.sys.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chat.sys.service.UserService;

@Controller
@RequestMapping("/user")
public class CoreController {
    @Resource
    private UserService userService;
    private Logger logger = Logger.getLogger(CoreController.class);

    @RequestMapping("/show")
    public String show(Model model) {
        User user = userService.getUserById(1);
        System.out.println(user.getId());

        System.out.println("new message!");
        System.out.println("new message2!");
        System.out.println("change now!");
        System.out.println("ok");
        return "index";
    }
}
