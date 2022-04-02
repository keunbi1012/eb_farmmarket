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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
     
    // Map<Integer ,String> msgs = new HashMap<>(){
    //     add(0, "성공"),
    //     add(1, "이미 있는 아이디입니다."),
    // };

    @Autowired // DI 
    private LoginService loginService;

    @PostMapping("/join") // http://doamin/user/join, { userId : lll, email : ddd, } 
    public String join(@RequestBody User user){

        //int result = loginService.join(user);  
        loginService.join(user);
        return "";
        // return mags.get(result);
    }

    @GetMapping("/login") // http://domain/user/login?userId=eb0101&&password=dddddddddd 
    public String login(String userId, String password){
        return loginService.login(new LoginForm(userId, password));
    }
}
