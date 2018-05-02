package com.tourist.controller;

import com.tourist.entity.Tour;
import com.tourist.service.TourService;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TourBookingController {
    @Autowired
    private TourService tourService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/tour-booking", method = RequestMethod.GET)
    public ModelAndView getTourBooking(@RequestParam("id") String id) {
        ModelAndView modelAndView = new ModelAndView("tourbooking");
        Tour tourHasChoose = tourService.getIdTour(id);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUsername());
        modelAndView.addObject("oneTour",tourHasChoose);
        return modelAndView;
    }
    
        @RequestMapping("/listtour")
    public String getListTour(Model model) {
        model.addAttribute("address", "VietNam");
        return "listtour";
    }
    
	
}
