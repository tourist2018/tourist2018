package com.tourist.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ngoc Quy on 4/22/2018.
 */
@Controller
public class CommonController {

    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String determineTargetUrl() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user.getAuthorities().toString().contains(ROLE_ADMIN)) {
            return "redirect:/home";
        } else if (user.getAuthorities().toString().contains(ROLE_USER)) {
            return "redirect:/tourbooking";
        }
        return "login";
    }
}
