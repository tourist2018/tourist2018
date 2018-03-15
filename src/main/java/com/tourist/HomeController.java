package com.tourist;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value= {"/", "/home"})
    public String home(Model model) {
        return "homePage";
    }
     
    @RequestMapping("/review")
    public String next(Model model) {
        model.addAttribute("address", "VietNam");
        return "review";
    }
    
    @RequestMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("address", "VietNam");
        return "login";
    }
	
}
