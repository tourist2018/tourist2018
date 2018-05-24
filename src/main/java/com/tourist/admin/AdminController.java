package com.tourist.admin;

import com.tourist.controller.UserNameAuthController;
import com.tourist.entity.OrderTour;
import com.tourist.entity.Tour;
import com.tourist.entity.User;
import com.tourist.service.OrderService;
import com.tourist.service.QuantityTourService;
import com.tourist.service.TourService;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Ngoc Quy on 5/11/2018.
 */
@Controller
public class AdminController {

    @Autowired
    private TourService tourService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;



    @RequestMapping(value = "/admin/index")
    public ModelAndView adminDashboard(){
        ModelAndView modelAndView = new ModelAndView("dashboard");
        modelAndView.addObject("hello", "Chào mừng bạn đến với trang dành cho ADMN");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/all-order")
    public ModelAndView adminAllOrderTour(Model model){
        ModelAndView modelAndView = new ModelAndView("admin-all-order");
        List<OrderTour> listAllTour = orderService.getAllOrder();
        OrderTour doneOrderForm = new OrderTour();
        OrderTour cancelOrderForm = new OrderTour();
        modelAndView.addObject("lists",listAllTour);
        model.addAttribute("doneOrderForm",doneOrderForm);
        model.addAttribute("cancelOrderForm",cancelOrderForm);
        return modelAndView;
    }

    @RequestMapping(value = "/admin/all-tour")
    public ModelAndView adminAllTour(){
        ModelAndView modelAndView = new ModelAndView("admin-all-tour");
        List<Tour> listAllTour = tourService.getAllTour();
        modelAndView.addObject("lists",listAllTour);
        return modelAndView;
    }
    @RequestMapping(value = "/admin/new-tour")
    public ModelAndView adminCreateNewTour(Model model){
        ModelAndView modelAndView = new ModelAndView("admin-new-tour");
//        Tour formTour = new Tour();
//        model.addAttribute("formTour",formTour);
        return modelAndView;
    }
}
