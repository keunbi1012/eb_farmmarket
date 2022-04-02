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
        // TODO: 기존에 있는 사용자인지 확인 : findByLoginId
        return userMapper.insertUser(user);
        // TODO: User return 대신 int 값으로 성공 (0), 실패 메세지 (1,2,3)  
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
