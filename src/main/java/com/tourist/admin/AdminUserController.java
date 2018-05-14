package com.tourist.admin;

import com.tourist.entity.User;
import com.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ngoc Quy on 5/12/2018.
 */
@Controller
public class AdminUserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/delete-user")
    public String deleteUser(String idUser){
        try
        {
            ModelAndView modelAndView = new ModelAndView("admin-all-user");
            User deleteAUser = userService.getById(idUser);
            userService.deleteUserById(idUser);
            return "redirect:/admin/all-user";
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return "redirect:/admin/index";
    }
}
