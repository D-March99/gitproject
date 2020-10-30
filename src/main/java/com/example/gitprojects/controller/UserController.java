package com.example.gitprojects.controller;


import com.example.gitprojects.entity.User;
import com.example.gitprojects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    private String hello(Model model, User user){
        List<User> userList = userService.findUsers();
        model.addAttribute("userList",userList);
        System.out.println("加一行语句");
        return "hello.html";
    }
}
