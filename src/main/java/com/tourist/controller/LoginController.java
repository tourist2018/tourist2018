package com.tourist.controller;

import com.tourist.entity.User;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login-and-register"},method = RequestMethod.GET)
    public ModelAndView loginAndRegister(ModelMap model){
        ModelAndView modelAndView = new ModelAndView("login-and-register");
        User userForm = new User();
        model.addAttribute("userForm",userForm);
        return modelAndView;
    }

    @RequestMapping(value = {"/login-tourist"})
    public ModelAndView loginTest(ModelMap model){
        ModelAndView modelAndView = new ModelAndView("login-tourist");
        User login = new User();
        model.addAttribute("login",login);
        return modelAndView;
    }

    @RequestMapping(value = {"/registration"},method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User userForm){
        ModelAndView modelAndView = new ModelAndView();

            userService.createNewUser(userForm);
            modelAndView.addObject("success","User has been registered successfully");
            modelAndView.addObject("userForm",new User());
            modelAndView.setViewName("login-and-register");

        return modelAndView;
    }

    @RequestMapping(value = "denied")
    public String getPageDenied(){
        return "denied";
    }
}
