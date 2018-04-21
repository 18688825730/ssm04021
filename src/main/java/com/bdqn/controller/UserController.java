package com.bdqn.controller;

import com.bdqn.model.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        User u = userService.login(user);
        if (u != null){
            return "teacher";
        }
        return "redirect:/index.jsp";
    }
}
