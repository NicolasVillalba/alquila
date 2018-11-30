package com.powersys.alquila.services.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powersys.alquila.domain.Property;
import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.repositories.PropertyRepository;
import com.powersys.alquila.services.interfaces.PropertyServiceInterface;

@Service
public class PropertyServiceImp implements PropertyServiceInterface {
	@Autowired
	private PropertyRepository propertyRepository;
	private PropertyDTO propertyDTO = new PropertyDTO();
	private List<PropertyDTO> listPropertyDTO = new ArrayList<>();

	// method for set propertyDTO
	public PropertyDTO propertyToDTO(Property property) {
		
		propertyDTO.setPlaceType(property.getType());
		propertyDTO.setPrice(property.getPrice());
		propertyDTO.setRooms(property.getPropertyDetail().getRooms());
		propertyDTO.setaStreet(property.getAdress().getStreet());
		propertyDTO.setaNumber(property.getAdress().getNumber());
		propertyDTO.setNotary(property.getLegalDetail().getNotary());
		propertyDTO.setContract(property.getLegalDetail().getContract());
		propertyDTO.setContractExpenses(property.getLegalDetail().getContractExpenses());
		propertyDTO.setInitialDeposit(property.getLegalDetail().getInitialDeposit());
		propertyDTO.setGuarantor(property.getLegalDetail().getGuarantor());
		propertyDTO.setAditionalBathroom(property.getPropertyDetail().getAditionalBathroom());
		propertyDTO.setBalcony(property.getPropertyDetail().getBalcony());
		propertyDTO.setYard(property.getPropertyDetail().getYard());
		propertyDTO.setAditionalProInfo(property.getPropertyDetail().getAditionalInfo());
		propertyDTO.setContractExpenses(property.getLegalDetail().getContractExpenses());
		propertyDTO.setInitialDepositValue(property.getLegalDetail().getInitialDepositValue());
		propertyDTO.setAditionalLegInfo(property.getLegalDetail().getAditionalInfo());
		propertyDTO.setaFloor(property.getAdress().getFloor());
		propertyDTO.setaApartment(property.getAdress().getApartment());
		propertyDTO.setExpenses(property.getExpenses());
		propertyDTO.setExpensesValue(property.getExpensesValue());
		propertyDTO.setaAditionalInfo(property.getAdress().getAditionalInfo());
		
		propertyDTO.setPath(property.getImage());
		propertyDTO.setPath2(property.getImage2());
		propertyDTO.setPath3(property.getImage3());
		propertyDTO.setPath4(property.getImage4());
		propertyDTO.setPath5(property.getImage5());
		propertyDTO.setGarage2(property.getPropertyDetail().getGarage2());
		propertyDTO.setDate(property.getDate());

		return propertyDTO;
	}

	@Override
	public List<PropertyDTO> findAll() {
		for(Property property : (List<Property>) this.propertyRepository.findAll() ) {
			this.listPropertyDTO.add(propertyToDTO(property));
			
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public PropertyDTO findOne(Long idProperty) {
		Property property = this.propertyRepository.findOne(idProperty);
		return propertyToDTO(property);
	}

	@Override
	public List<PropertyDTO> findByPriceTypeRooms(Integer price, String type, String rooms) {
		for(Property property : (List<Property>) this.propertyRepository.findByPriceTypeRooms(price, type, rooms)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByPriceType(Integer price, String type) {
		for(Property property : (List<Property>) this.propertyRepository.findByPriceType(price, type)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByTypeRooms(String type, String rooms) {
		for(Property property : (List<Property>) this.propertyRepository.findByTypeRooms(type, rooms)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByPriceRooms(Integer price, String rooms) {
		for(Property property : (List<Property>) this.propertyRepository.findByPriceRooms(price, rooms)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByType(String type) {
		for(Property property : (List<Property>) this.propertyRepository.findByType(type)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByPrice(Integer price) {
		for(Property property : (List<Property>) this.propertyRepository.findByPrice(price)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

	@Override
	public List<PropertyDTO> findByRooms(String rooms) {
		for(Property property : (List<Property>) this.propertyRepository.findByRooms(rooms)) {
			this.listPropertyDTO.add(propertyToDTO(property));
		}
		
		return this.listPropertyDTO;
	}

}
