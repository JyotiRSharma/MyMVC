package com.home.myCafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String welcome(Model model) {
		
		String myName = "Jyoti Ranjan";
		model.addAttribute("myNameValue", myName);
		
		return "welcom-page";
	}
	
}
