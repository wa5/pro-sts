package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String  registrationform() {
		System.out.println("im getting executed");
		return "form";
		
	}
	
	@RequestMapping("/userDetails")
	public ModelAndView  userinfo(UserRegistrationModel reg) {
		ModelMap model=new ModelMap();
		model.addAttribute("name",reg.getName());
		model.addAttribute("email",reg.getEmail());
		model.addAttribute("password",reg.getPassword());
		
		ModelAndView mv=new ModelAndView("userdetails");
		mv.addObject("regobj",model);
		System.out.println("im getting executed" +reg.getName());
		return mv;
		
	}
	
	
}
