package com.powersys.alquila.webControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.services.implementations.InmuebleService;
import com.powersys.alquila.services.implementations.StorageServise;

@Controller
public class InmuebleWebVC {

	private InmuebleService inmuebleService;	
	
	private StorageServise image;

	public InmuebleWebVC(InmuebleService service, StorageServise image) {
		this.inmuebleService = service;
		this.image = image;
	}

	@RequestMapping(value = "/cargarInmueble", method = RequestMethod.GET)
	public String cargarInmuebleForm(Model model) {
		model.addAttribute("inmueble", new PropertyDTO());
		return "form3";
	}
	
	@PostMapping("/cargarInmueble")
	public String altaInmueble(@ModelAttribute PropertyDTO inmuebleDTO, Model model) {
		inmuebleDTO.setPath(this.image.store(inmuebleDTO.getImage()));
		inmuebleDTO.setPath2(this.image.store(inmuebleDTO.getImage2()));
		inmuebleDTO.setPath3(this.image.store(inmuebleDTO.getImage3()));
		inmuebleDTO.setPath4(this.image.store(inmuebleDTO.getImage4()));
		inmuebleDTO.setPath5(this.image.store(inmuebleDTO.getImage5()));
		this.inmuebleService.insertInmueble(inmuebleDTO);
		return "redirect:/";
	}	

	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("inmueble", this.inmuebleService.findAll());
		return "home1";
	}
	
	@RequestMapping (value= "/terminosYcondic", method = RequestMethod.GET)	
	public String terminos (Model model) {
		return "terminosYcondic";
	}
	
	
	
}
