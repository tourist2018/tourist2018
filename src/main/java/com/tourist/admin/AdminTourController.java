package com.tourist.admin;

import com.tourist.entity.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ngoc Quy on 5/12/2018.
 */
@Controller
public class AdminTourController {

    @RequestMapping(value = "/admin/create-tour")
    public ModelAndView adminCreateNewTour(Model model){
        return  null;
    }
}
