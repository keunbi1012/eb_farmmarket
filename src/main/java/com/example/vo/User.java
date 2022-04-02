package com.example.vo;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String userId;
    private String name;
    private String email;
    private String address;
    private String password;
}
