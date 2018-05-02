package com.tourist.controller;

import com.tourist.entity.Tour;
import com.tourist.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TourService tourService;

    @RequestMapping(value= {"/home"})
    public ModelAndView home(Model model) {
        ModelAndView modelAndView = new ModelAndView("homePage");
        List<Tour> listTour = tourService.getAllTour();
        modelAndView.addObject("lists",listTour);
        return modelAndView;
    }
    @RequestMapping(value= {"/"})
    public String homePage(Model model) {
        return "redirect:/home";
    }
     
    @RequestMapping("/review")
    public String next(Model model) {
        model.addAttribute("address", "VietNam");
        return "review";
    }
    
    /*@RequestMapping("/login-user")
    public String getLogin(Model model) {
        model.addAttribute("address", "VietNam");
        return "login";
    }*/

}
