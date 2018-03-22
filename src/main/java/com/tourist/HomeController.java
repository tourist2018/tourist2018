package com.tourist;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value= {"/*", "/home"})
    public ModelAndView home(Model model) {
        return new ModelAndView("homePage");
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
    
    @RequestMapping("/tourbooking")
    public String getTourBooking(Model model) {
        model.addAttribute("address", "VietNam");
        return "tourbooking";
    }
    
    @RequestMapping("/listtour")
    public String getListTour(Model model) {
        model.addAttribute("address", "VietNam");
        return "listtour";
    }
  
	
}
