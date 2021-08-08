package com.example.demo.withoutdatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegFormController {

	
	@RequestMapping("/registrationfile")
	public String reg() {
		System.out.println("im working");
		return "registrationfile";
	}
	
	
	@RequestMapping("/userdata")
	public ModelAndView gettingdata(RegFormModel reg) {
		ModelMap model=new ModelMap();
		model.addAttribute("name",reg.getName());
		model.addAttribute("email",reg.getEmail());
		model.addAttribute("password",reg.getPassword());
		
		ModelAndView mv=new ModelAndView("userdata");
		mv.addObject("regdobj",model);
		System.out.println("im working");
		return mv;
	}
	
}
