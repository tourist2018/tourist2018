package com.tourist.controller;

import com.tourist.entity.OrderTour;
import com.tourist.entity.Tour;
import com.tourist.entity.User;
import com.tourist.service.OrderService;
import com.tourist.service.TourService;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TourBookingController {
    @Autowired
    private TourService tourService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/tour-booking", method = RequestMethod.GET)
    public ModelAndView getTourBooking(@RequestParam("id") String id) {
        ModelAndView modelAndView = new ModelAndView("tourbooking");
        Tour tourHasChoose = tourService.getIdTour(id);
        /*User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUsername());*/
        /*String testId = "2ef674ac-f522-40ed-88f7-b2b44424b43d";
        System.out.println("-------------");

        System.out.println("Sum: "+sum);
        System.out.println("-------------");*/
        System.out.println("--------------");
        List<OrderTour> lists = orderService.getAllOrder();

        System.out.println(lists);
        int sum = lists.size();
        System.out.println(sum);
        /*try {
            List<OrderTour> lists = orderService.getAllOrder();
            System.out.println(lists);
            int sum = lists.size();
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }*/
        modelAndView.addObject("oneTour", tourHasChoose);
        return modelAndView;
    }
    String username = null;
    @RequestMapping("/list-tour")
    public ModelAndView getListTour(Model model) {
        ModelAndView modelAndView = new ModelAndView("list-tour");
        UserNameAuthController userNameAuthController = new UserNameAuthController();
        String name = userNameAuthController.getUserName();

        User logined = userService.getByUsername(name);
        System.out.println(logined.getId());

        List<OrderTour> lists = orderService.getOrderByUser(logined.getId());
        modelAndView.addObject("lists",lists);
        return modelAndView;
    }


}
