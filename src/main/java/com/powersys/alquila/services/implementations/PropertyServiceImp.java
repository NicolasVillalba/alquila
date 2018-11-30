package com.powersys.alquila.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powersys.alquila.domain.Property;
import com.powersys.alquila.domain.PropertyDetail;
import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.dtos.SearchDTO;
import com.powersys.alquila.repositories.PropertyRepository;
import com.powersys.alquila.repositories.PropertyServiceInterface;

@Service
public class PropertyServiceImp implements PropertyServiceInterface {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	public boolean searchInmueble(SearchDTO search) {
		Property p = new Property();
		PropertyDetail pd = new PropertyDetail();
		
		p.setType(search.getPlaceType());
		p.setPrice(search.getPrice());
		pd.setRooms(search.getRooms());
		
		propertyRepository.save(p);
		
		return true;
	}
	
	

	@Override
	public List<PropertyDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropertyDTO findOne(Long idPropertyDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByPriceTypeRooms(Integer price, String type, String rooms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByPriceType(Integer price, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByTypeRooms(String type, String rooms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByPriceRooms(Integer price, String rooms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByPrice(Integer price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyDTO> findByRooms(String rooms) {
		// TODO Auto-generated method stub
		return null;
	}



	public void insertInmueble(SearchDTO inmuebleDTO) {
		// TODO Auto-generated method stub
		
	}

	
}


