package com.powersys.alquila.webControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.dtos.SearchDTO;
import com.powersys.alquila.services.implementations.PropertyServiceImp;

public class SearchWC {
	@Autowired
	private PropertyServiceImp propertyService;
	
	@GetMapping(value = "/search")
	public String search(Model model) {
		model.addAttribute("search", this.propertyService.findAll());
		return "index";
	}
	
	@PostMapping("/search")
	public String search(@ModelAttribute SearchDTO searchDTO, Model model) {
		
		
		
		return "redirect:/index";
	}	
	
}