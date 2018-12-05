package com.powersys.alquila.services.interfaces;

import java.util.List;

import com.powersys.alquila.dtos.PropertyDTO;



public interface PropertyServiceInterface {
	
	public List<PropertyDTO> findAll(); 
	
	public PropertyDTO findOne(Long idProperty);

	public List<PropertyDTO> findByPriceTypeRooms(Integer price, String type, String rooms);

	public List<PropertyDTO> findByPriceType(Integer price, String type);

	public List<PropertyDTO> findByTypeRooms(String type, String rooms);

	public List<PropertyDTO> findByPriceRooms(Integer price, String rooms);	

	public List<PropertyDTO> findByType(String type);
	
	public List<PropertyDTO> findByPrice(Integer price);
	
	public List<PropertyDTO> findByRooms(String rooms);
}
