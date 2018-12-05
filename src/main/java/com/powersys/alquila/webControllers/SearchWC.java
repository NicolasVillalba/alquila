package com.powersys.alquila.webControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.dtos.SearchDTO;
import com.powersys.alquila.repositories.PropertyRepository;
import com.powersys.alquila.services.implementations.PropertyServiceImp;

@Controller
public class SearchWC {
	@Autowired
	private PropertyServiceImp propertyService;
	
	@GetMapping(value = "/search")
	public String search(Model model) {
		List<PropertyDTO> list = this.propertyService.findByPrice(60000);
		model.addAttribute("property", list);
		return "results";
	}
	
	@PostMapping("/search")
	public String search(@ModelAttribute SearchDTO searchDTO, Model model) {
		
		
		//ninguno seteado
		if(searchDTO.getPlaceType() == null && searchDTO.getPrice() == null && searchDTO.getRooms() == null) 
		{
			model.addAttribute("property", this.propertyService.findAll());
			System.out.println("::::::::::::ninguno seteado:::::::::::::");
			System.out.println(searchDTO.getPlaceType());
			System.out.println(searchDTO.getPrice());
			System.out.println(searchDTO.getRooms());
			
			return "results";
		}
		//todos seteados
		if(searchDTO.getPlaceType() != null && searchDTO.getPrice() != null && searchDTO.getRooms() != null) 
		{
			model.addAttribute("property", this.propertyService.findByPriceTypeRooms(
					Integer.getInteger(searchDTO.getPrice()), 
					searchDTO.getPlaceType(), 
					searchDTO.getRooms())
			);
			
			return "results";
		}
		
		//solo precio
		if(searchDTO.getPrice() != null && searchDTO.getPlaceType() == null && searchDTO.getRooms() == null) {
			model.addAttribute("property", this.propertyService.findByPrice(Integer.getInteger(searchDTO.getPrice())));
			return "results";
		}
		//solo place type
		if(searchDTO.getPrice() == null && searchDTO.getPlaceType() != null && searchDTO.getRooms() == null) {
			model.addAttribute("property", this.propertyService.findByType(searchDTO.getPlaceType()));
			System.out.println(searchDTO.getPlaceType());
			System.out.println(searchDTO.getPrice());
			System.out.println(searchDTO.getRooms());
			return "results";
		}
		//solo rooms
		if(searchDTO.getPrice() == null && searchDTO.getPlaceType() == null && searchDTO.getRooms() != null) {
			model.addAttribute("property", this.propertyService.findByRooms(searchDTO.getRooms()));
			return "results";
		}
		//precio room
		if(searchDTO.getPrice() != null && searchDTO.getPlaceType() == null && searchDTO.getRooms() != null) {
			model.addAttribute("property", this.propertyService.findByPriceRooms(Integer.getInteger(searchDTO.getPrice()), searchDTO.getRooms()));
			return "results";
		}
		//precio tipo
		if(searchDTO.getPrice() != null && searchDTO.getPlaceType() != null && searchDTO.getRooms() == null) {
			model.addAttribute("property", this.propertyService.findByPriceType(Integer.getInteger(searchDTO.getPrice()), searchDTO.getPlaceType()));
			return "results";
		}
		//tipo room
		if(searchDTO.getPrice() == null && searchDTO.getPlaceType() != null && searchDTO.getRooms() != null) {
			model.addAttribute("property", this.propertyService.findByTypeRooms(searchDTO.getPlaceType(), searchDTO.getRooms()));
			return "results";
		}
		model.addAttribute("empty", true);
		return "results";
	}	
	
}