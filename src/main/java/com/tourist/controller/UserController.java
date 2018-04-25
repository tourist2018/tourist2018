package com.tourist.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tourist.entity.User;
import com.tourist.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;


	
	@RequestMapping("/")
    public ModelAndView next(Model model) {
		ModelAndView modelAndView = new ModelAndView("infoUser");
        
        try {
        	List<User> users = userService.getAllUser();
        	System.out.println("USER: "+users.size());
        	modelAndView.addObject("lists", users);
		} catch (Exception e) {
			System.out.println("Blank in DB");
			modelAndView.addObject("emptyUser", "Blank");
		}
        return modelAndView;
    }

}
