package com.example.controller;

import java.util.Map;

import com.example.service.LoginService;
import com.example.vo.LoginForm;
import com.example.vo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    @PostMapping("/join")
    public User join(@RequestBody User user){
        return loginService.join(user);
    }

    @GetMapping("/login")
    public String login(String userId, String password){
        return loginService.login(new LoginForm(userId, password));
    }
}
