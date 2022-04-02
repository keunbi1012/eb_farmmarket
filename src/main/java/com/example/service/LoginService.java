package com.example.service;

import java.util.Map;
import java.util.Optional;

import com.example.mapper.UserMapper;
import com.example.vo.LoginForm;
import com.example.vo.User;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {

    @Autowired
    public UserMapper userMapper;

    
    public User join(User user) {
        return userMapper.save(user);
    }

    public String login(LoginForm loginForm) {
        Optional<User> matched = userMapper.findByLoginId(loginForm.getUserId());
        if(matched.empty() == null){
            throw new RuntimeException("Id is not existed in DB.");
        }

        //TODO: password 확인

        //TODO: jwt token 발급

        return "";
    }

}
