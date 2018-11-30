package com.powersys.alquila.webControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.powersys.alquila.dtos.InmuebleDTO;
import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.dtos.SearchDTO;
import com.powersys.alquila.services.interfaces.PlaceDetailService;
import com.powersys.alquila.services.implementations.InmuebleService;
import com.powersys.alquila.services.implementations.PropertyServiceImp;

@Controller
@RequestMapping("/property/")
public class PlaceDetailController {
	
	private PlaceDetailService placeDetail;
	
	private InmuebleService inmuebleService;
	private PropertyServiceImp propertyService;
	
	
	public PlaceDetailController(PlaceDetailService placeDetail, InmuebleService inmuebleService) {
		this.placeDetail = placeDetail;
		this.inmuebleService = inmuebleService;
	}
	
	@GetMapping("/{id}")
	public String place(@PathVariable Long id, Model model) {
		model.addAttribute("property", this.placeDetail.get(id));
		return "propertyDetails";
	}
	
	@GetMapping("/add")
	public String place(Model model) {
		model.addAttribute("inmueble", new PropertyDTO());
		return "form3";
	}
	
	@PostMapping("/add")
	public String altaInmueble(@ModelAttribute PropertyDTO inmuebleDTO) {
		this.inmuebleService.insertInmueble(inmuebleDTO);
		return "redirect:add";
	}
	
	@GetMapping("/search")
	public String search(Model model) {
		model.addAttribute("search", new SearchDTO());
		return "index";
	}
	
	@PostMapping("/search")
	public String search(@ModelAttribute SearchDTO searchDTO) {
		this.inmuebleService.propertyServiceImp(searchDTO);
		return "redirect:search";
	}
}
