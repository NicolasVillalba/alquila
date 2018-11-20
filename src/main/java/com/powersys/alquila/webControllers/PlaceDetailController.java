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
import com.powersys.alquila.services.interfaces.PlaceDetailService;
import com.powersys.alquila.services.implementations.InmuebleService;

@Controller
@RequestMapping("/property/")
public class PlaceDetailController {
	
	private PlaceDetailService placeDetail;
	
	private InmuebleService inmuebleService;
	
	
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
	public String altaInmueble(@ModelAttribute InmuebleDTO inmuebleDTO) {
		this.inmuebleService.insertInmueble(inmuebleDTO);
		return "redirect:add";
	}
}
