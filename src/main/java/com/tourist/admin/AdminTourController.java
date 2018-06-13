package com.tourist.admin;

import com.tourist.entity.OrderTour;
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
import java.util.*;

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



    @RequestMapping(value = "/admin/thongke-tour")
    public ModelAndView adminThongKeTour(@Valid OrderTour cancelOrderForm){
        ModelAndView modelAndView = new ModelAndView("thongke");
        List<Tour> tourThongKe = tourService.getTourByCustomValue();
        List<Tour> tourThongKe1 = tourService.getAllTour();
        System.out.println(tourThongKe);
        /*for (int i = 0; i < tourThongKe.size(); i++){
            System.out.println(tourThongKe.get(i).getId());
            System.out.println(tourThongKe.get(i).getAddress());
            System.out.println(tourThongKe.get(i).getDateStart());
            Object obj = tourThongKe.get(i).getAddress();
            for (int j=0; j<=4; j++){
                System.out.println(obj);
            }
        }*/
        /*ArrayList<Object> result = (ArrayList) tourThongKe.listIterator();
        Iterator itr = result.iterator();
        while(itr.hasNext()){
            Object[] obj = (Object[]) itr.next();

            String client = String.valueOf(obj[0]);
            Integer service = Integer.parseInt(String.valueOf(obj[1]));

            System.out.println(client);
            System.out.println(service);
        }*/
        modelAndView.addObject("lists",tourThongKe);
        return modelAndView;
    }
}
