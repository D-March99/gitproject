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

    @RequestMapping("hello")
    private String hello(Model model, User user){
        List<User> userList = userService.findUsers();
        model.addAttribute("userList",userList);
        return "hello.html";
    }

    @RequestMapping("addUser")
    private String addUser(User user,Model model){
        int rows = userService.addUser(user);
        if (rows>0){
            return "redirect:hello";
        }else {
            model.addAttribute("msg","插入失败");
            return "hello.html";
        }
    }
}
