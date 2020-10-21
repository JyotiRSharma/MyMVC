package com.home.myCafe.controllers;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/processRequest")
	public String processRequest(HttpServletRequest request, Model model) {
		
		//Get user data from welcom-page
		String userEnteredData = request.getParameter("foodType");
		
		//Set the data to userInput variable
		model.addAttribute("userInput", userEnteredData);
		
		//Set the user data with model object and send it to the view
		return "processRequest";
	}
}
