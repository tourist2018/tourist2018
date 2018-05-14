package com.tourist.controller;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.OrderTour;
import com.tourist.entity.Tour;
import com.tourist.entity.User;
import com.tourist.service.OrderService;
import com.tourist.service.QuantityTourService;
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

import javax.validation.Valid;
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
    public ModelAndView getTourBooking(@RequestParam("id") String id, Model model) {
        ModelAndView modelAndView = new ModelAndView("tourbooking");
        Tour tourHasChoose = tourService.getIdTour(id);

        System.out.println("--------------");
        List<OrderTour> lists = orderService.getAllOrder();

        UserNameAuthController userNameAuthController = new UserNameAuthController();
        String name = userNameAuthController.getUserName();
        User logined = userService.getByUsername(name);

        int numberTour = tourService.getQuantityTour(EnumStatusBooking.WAITING,tourHasChoose);

        modelAndView.addObject("oneTour", tourHasChoose);
        modelAndView.addObject("numberTour", numberTour);
        model.addAttribute("form_booking", new OrderTour());
        model.addAttribute("user_id", logined.getId());
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
        modelAndView.addObject("delete_booking", new OrderTour());
        return modelAndView;
    }

    @RequestMapping(value = "/form-booking",method = RequestMethod.POST)
    public String getTourBooking(@Valid OrderTour form_booking) {

        orderService.createOrderTour(form_booking);
        return "redirect:/list-tour";
    }

    @RequestMapping(value = "/delete-booking",method = RequestMethod.GET)
    public String deleteOrderTourBooking(@Valid OrderTour delete_booking) {
        String idOrderTourBooking = delete_booking.getId();
        orderService.deleteOrderTour(idOrderTourBooking);
        return "redirect:/list-tour";
    }


}
