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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        int numberTour = tourService.getQuantityTour(EnumStatusBooking.DONE,tourHasChoose);

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

    //search @RequestParam(value="dateStart", required=false) Date dateStart,
    @RequestMapping(value = "/search-tour",method = RequestMethod.GET)
    public ModelAndView searchTourBooking(@RequestParam(value="address", required=false) String address,
                                    @RequestParam(value="dateStart", required=false) String dateStart,
                                    @RequestParam(value="costTour", required=false) int costTour) {
        List<Tour> listTourSearch = null;
        ModelAndView modelAndView = new ModelAndView("list-search");

        /*String d = dateStart;
        java.sql.Date sql= null;*/


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedCurrentDate = null;

        try {
            if (dateStart == ""){
                convertedCurrentDate = null;
            }else {
                convertedCurrentDate = sdf.parse(dateStart);
                /*sql = new java.sql.Date(convertedCurrentDate.getTime());
                System.out.println(sql);*/
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (address =="" && dateStart == "" && costTour == 0){
            System.out.println("null all");
            return modelAndView;
        }
        else if (address =="" && dateStart == ""){
            System.out.println("null cost");
            listTourSearch = tourService.searchTourByCost(costTour);
        }

        else if (address =="" && costTour == 0){
            try {

                System.out.println();
                System.out.println("value address");
                System.out.println(convertedCurrentDate);
                /*Tour t1 = tourService.getByDateStart(convertedCurrentDate);
                System.out.println(t1.getDateStart());*/
                List<Tour> listTestTour = tourService.searchTourByDate(convertedCurrentDate);
                System.out.println("-----------");
                System.out.println(listTestTour.get(0).getDateStart());
                listTourSearch = tourService.searchTourByDate(convertedCurrentDate);
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
        }

        else if (dateStart == "" && costTour == 0) {
            try {

                System.out.println("null address");
                listTourSearch = tourService.searchTourByAddress(address);
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
        }
        else if (address == ""){
            listTourSearch = tourService.searchTourByDateAndCost(convertedCurrentDate,costTour);
        }
        else if (dateStart == "") {
            listTourSearch = tourService.searchTourByAddressAndCost(address,costTour);
        }
        else if (costTour == 0){
            listTourSearch = tourService.searchTourByAddressAndDate(address,convertedCurrentDate);
        }
        else if((address!="")&&(dateStart!="")&&(costTour!=0)){
            listTourSearch = tourService.searchTourAll(address,convertedCurrentDate,costTour);
        }

        modelAndView.addObject("lists",listTourSearch);

        return modelAndView;
    }

}
