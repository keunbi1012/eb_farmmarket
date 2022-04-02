package com.example.vo;

import lombok.Data;

@Data
public class LoginForm {

    // TODO: Remove this later
    public LoginForm(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    private String userId;
    private String password;
}
