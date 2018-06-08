package com.tourist.admin;

import com.tourist.entity.User;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Ngoc Quy on 5/12/2018.
 */
@Controller
public class AdminUserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/delete-user", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") String idUser){
        try
        {
            ModelAndView modelAndView = new ModelAndView("admin-all-user");
            User deleteAUser = userService.getById(idUser);
            System.out.println("come");
            userService.deleteUserById(idUser);
            return "redirect:/admin/all-user";
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return "redirect:/admin/index";
    }


    @RequestMapping(value = "/admin/all-user")
    public ModelAndView adminAllUser(Model model){
        ModelAndView modelAndView = new ModelAndView("admin-all-user");

        List<User> listAllUser = userService.getAllUser();
        modelAndView.addObject("lists",listAllUser);
        return modelAndView;
    }
}
