package com.tourist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TourBookingController {


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
