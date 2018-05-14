package com.tourist.admin;

import com.tourist.entity.EnumStatusBooking;
import com.tourist.entity.OrderTour;
import com.tourist.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Ngoc Quy on 5/12/2018.
 */
@Controller
public class AdminOrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/admin/done-order", method = RequestMethod.POST)
    public String adminDoneOrderTour(@Valid OrderTour doneOrderForm){
        orderService.checkDoneOrderTour(doneOrderForm);
        return "redirect:all-order";
    }

    @RequestMapping(value = "/admin/cancel-order", method = RequestMethod.POST)
    public String adminCancelOrderTour(@Valid OrderTour cancelOrderForm){
        orderService.checkCancelOrderTour(cancelOrderForm);
        return "redirect:all-order";
    }
}
