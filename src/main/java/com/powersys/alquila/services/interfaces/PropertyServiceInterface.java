package com.powersys.alquila.services.interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.powersys.alquila.dtos.PropertyDTO;



public interface PropertyServiceInterface {
	
	public List<PropertyDTO> findAll(); 
	
	public PropertyDTO findOne(@Param("idProperty") Long idProperty);

	public List<PropertyDTO> findByPriceTypeRooms(@Param("price") Integer price,@Param("type") String type, @Param("rooms") String rooms);

	public List<PropertyDTO> findByPriceType(@Param("price") Integer price,@Param("type") String type);

	public List<PropertyDTO> findByTypeRooms(@Param("type") String type, @Param("rooms") String rooms);

	public List<PropertyDTO> findByPriceRooms(@Param("price") Integer price, @Param("rooms") String rooms);	

	public List<PropertyDTO> findByType(String type);
	public List<PropertyDTO> findByPrice(Integer price);
	public List<PropertyDTO> findByRooms(String rooms);
}
