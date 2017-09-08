package com.ex.mongodb.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String landingPage(Model model)
	{
		model.addAttribute("message", "this is home page");
		return "home";
	}
	
	
	
}
