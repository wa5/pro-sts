package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.deo.ChocalateRepository;
import com.example.demo.entity.Chocalate;

@Controller
public class MainController {
	
	
	@Autowired
	public ChocalateRepository repository;
	
	
	@RequestMapping("/index")
	public String  index() {
		return "index";
		
	}
	
	
	@RequestMapping("/chocalateDetails")
	public String chocalateDetails(Chocalate newchacalate) {
		repository.save(newchacalate);//save in data
		return "operations";
		
	}
	
	
	@RequestMapping("/operations")
	public String operations() {
		//repository.save(newchacalate);
		
		//repository.findAll();
		return "operations";
		
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/home")
	public String home(ModelMap model) {
		Chocalate newchacalate=new Chocalate();
		newchacalate.setName("silk");
		newchacalate.setPrice("60");
		repository.save(newchacalate);
		
		
		
		model.addAttribute("key","world");
		System.out.println("im getting executed");
		return "home";
		
	}
	

}
