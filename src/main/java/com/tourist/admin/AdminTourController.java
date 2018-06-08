package com.tourist.admin;

import com.tourist.entity.Tour;
import com.tourist.entity.User;
import com.tourist.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Ngoc Quy on 5/12/2018.
 */
@Controller
public class AdminTourController {

    @Autowired
    private TourService tourService;

    @RequestMapping(value = "/admin/create-tour",method = RequestMethod.POST)
    public String adminCreateNewTour(
            @RequestParam(value="address", required=false) String address,
            @RequestParam(value="title", required=false) String title,
            @RequestParam(value="content", required=false) String content,
            @RequestParam(value="dateStart", required=false) String dateStart,
            @RequestParam(value="dateEnd", required=false) String dateEnd,
            @RequestParam(value="tourTimes", required=false) String tourTimes,
            @RequestParam(value="costTour", required=false) int costTour,
            @RequestParam(value="quantity", required=false) int quantity
    ){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Tour newTour = new Tour();
            String randomId = UUID.randomUUID().toString();
            newTour.setId(randomId);
            newTour.setAddress(address);
            newTour.setTitle(title);
            newTour.setContent(content);
            newTour.setDateStart(sdf.parse(dateStart));
            newTour.setDateEnd(sdf.parse(dateEnd));
            newTour.setTourTimes(tourTimes);
            newTour.setCostTour(costTour);
            newTour.setQuantity(quantity);
            tourService.newATour(newTour);
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return "redirect:/admin/all-tour";
    }

    @RequestMapping(value = "/admin/delete-tour", method = RequestMethod.POST)
    public String deleteTour(@RequestParam("id") String idTour){
        try
        {
            ModelAndView modelAndView = new ModelAndView("admin-all-tour");
//            User deleteAUser = userService.getById(idUser);
            System.out.println("come");
//            userService.deleteUserById(idUser);
            tourService.deleteATour(idTour);
            return "redirect:/admin/all-tour";
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return "redirect:/admin/index";
    }
}
