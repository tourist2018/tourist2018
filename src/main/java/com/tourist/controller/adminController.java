package com.tourist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tourist.entity.Tour;

@Controller
public class adminController {

	@RequestMapping("/page-admin")
	public String next(Model model) {
		model.addAttribute("address", "VietNam");
		return "definitionAdmin";
	}

}
