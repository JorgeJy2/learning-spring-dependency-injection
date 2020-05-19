package com.jorgejy.mvc.id.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jorgejy.mvc.id.web.app.model.service.IService;

@Controller
@RequestMapping("/home")
public class IndexController {

	// Constructor, set and property
	@Autowired
	@Qualifier("noAnnotationService")
	private IService myServices;

	
	
	@GetMapping({ "/index"})
	public String index(Model model) {
		model.addAttribute("getMeeting", myServices.getHello());
		return "index";
	}

	
	
}
