package com.powersys.alquila.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.powersys.alquila.domain.Property;
import com.powersys.alquila.dtos.PropertyDTO;
import com.powersys.alquila.repositories.PlacesRepository;
import com.powersys.alquila.services.interfaces.PlaceDetailService;

@Primary
@Service
public class PlaceDetailServiceImpl implements PlaceDetailService {

	@Autowired
	private PlacesRepository placesRepo;
	
	@Override
	public PropertyDTO get(Long id) {
		
		Property p = getOne(id);
				
		PropertyDTO pd = new PropertyDTO();
								 
				 pd.setPlaceType(p.getType());
				 pd.setExpenses(p.getExpenses());
				 pd.setExpensesValue(p.getExpensesValue());
				 pd.setRooms(p.getPropertyDetail().getRooms());
				 pd.setPrice(p.getPrice());
				
				 pd.setaStreet(p.getAdress().getStreet());
				 pd.setaNumber(p.getAdress().getNumber());
				 pd.setaFloor(p.getAdress().getFloor());
				 pd.setaApartment(p.getAdress().getApartment());
				 pd.setaAditionalInfo(p.getAdress().getAditionalInfo());
				 
				 pd.setAditionalBathroom(p.getPropertyDetail().getAditionalBathroom());
				 pd.setYard(p.getPropertyDetail().getYard());
				 pd.setGarage2(p.getPropertyDetail().getGarage2());
				 pd.setBalcony(p.getPropertyDetail().getBalcony());
				 pd.setAditionalProInfo(p.getPropertyDetail().getAditionalInfo());
				 
				 pd.setGuarantor(p.getLegalDetail().getGuarantor());
				 pd.setNotary(p.getLegalDetail().getNotary());
				 pd.setContract(p.getLegalDetail().getContract());
				 pd.setContractExpenses(p.getLegalDetail().getContractExpenses());
				 pd.setContractExpensesValue(p.getLegalDetail().getContractExpensesValue());
				 pd.setInitialDeposit(p.getLegalDetail().getInitialDeposit());
				 pd.setInitialDepositValue(p.getLegalDetail().getInitialDepositValue());
				 pd.setAditionalLegInfo(p.getLegalDetail().getAditionalInfo());
				 
				 pd.setPath(p.getImage());
				 pd.setPath2(p.getImage2());
				 pd.setPath3(p.getImage3());
				 pd.setPath4(p.getImage4());
				 pd.setPath5(p.getImage5());				 

				
				return pd;
	}
	
	private Property getOne(Long id) {
		return placesRepo.findById(id);
	}

}
