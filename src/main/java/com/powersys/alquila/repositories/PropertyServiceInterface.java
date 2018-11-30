package com.powersys.alquila.repositories;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.powersys.alquila.dtos.PropertyDTO;


@Repository
public interface PropertyServiceInterface {
	
	public List<PropertyDTO> findAll(); 
	
	public PropertyDTO findOne(@Param("idPropertyDTO") Long idPropertyDTO);

	public List<PropertyDTO> findByPriceTypeRooms(@Param("price") Integer price,@Param("type") String type, @Param("rooms") String rooms);

	public List<PropertyDTO> findByPriceType(@Param("price") Integer price,@Param("type") String type);

	public List<PropertyDTO> findByTypeRooms(@Param("type") String type, @Param("rooms") String rooms);

	public List<PropertyDTO> findByPriceRooms(@Param("price") Integer price, @Param("rooms") String rooms);	

	public List<PropertyDTO> findByType(String type);
	public List<PropertyDTO> findByPrice(Integer price);
	public List<PropertyDTO> findByRooms(String rooms);
}
