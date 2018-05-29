package com.tourist.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageAdminControllerr {

	@RequestMapping("/page-admin")
	public String next(Model model) {
		model.addAttribute("address", "VietNam");
		return "definitionAdmin";
	}

}