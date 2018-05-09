package com.tourist.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created by Ngoc Quy on 5/9/2018.
 */
public class UserNameAuthController {
    public UserNameAuthController(){


    }
    public String getUserName(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername().toString();
        System.out.println("-------------");
        System.out.println(name);
        return name;
    }
}
