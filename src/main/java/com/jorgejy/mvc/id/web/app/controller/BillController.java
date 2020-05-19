package com.jorgejy.mvc.id.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jorgejy.mvc.id.web.app.model.domain.Bill;
@Controller
@RequestMapping("/bill")
public class BillController {
	@Autowired
	private Bill bill;
	
	@GetMapping({"/show", "/", ""})
	public String show(Model model) {
		model.addAttribute("bill", bill);
		model.addAttribute("title", "Factura con ID");		
		return "bill/show";
	}
}
