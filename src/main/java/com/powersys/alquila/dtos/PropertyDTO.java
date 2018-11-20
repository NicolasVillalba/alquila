package com.powersys.alquila.dtos;

import com.powersys.alquila.dtos.DetailDTO;

import java.util.ArrayList;
import java.util.List;

public class PropertyDTO {
	
	private String placeType;
	private String rooms;
	private String price;
	private String aStreet;
	private String aNumber;
	private List<DetailDTO> aDetails = new ArrayList<>();
	private List<DetailDTO> pDetails = new ArrayList<>();
	private List<String> photos;
	private String description;
	private List<DetailDTO> legals= new ArrayList<>();
	
	public PropertyDTO() {
				
	}
	
	public void addDetail(String name, String value) {
		this.legals.add(new DetailDTO(name, value));
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getaStreet() {
		return aStreet;
	}

	public void setaStreet(String aStreet) {
		this.aStreet = aStreet;
	}

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<DetailDTO> getLegals() {
		return legals;
	}
	
	public List<DetailDTO> getaDetails() {
		return aDetails;
	}

	public void setaDetails(List<DetailDTO> aDeatails) {
		this.aDetails = aDeatails;
	}

	public List<DetailDTO> getpDetails() {
		return pDetails;
	}

	public void setpDetails(List<DetailDTO> pDetails) {
		this.pDetails = pDetails;
	}
	
	public String getGuarantor() {
		return "";
	}
	
	private String getDetail(String name, List<DetailDTO> list) {
		DetailDTO dto = new DetailDTO(name.toLowerCase(), "");
		if(!list.contains(dto)) throw new UnsupportedOperationException();
		return list.get(list.indexOf(dto)).getValue();
	}
	
	public void setGuarantor(String value) {
		DetailDTO d = new DetailDTO("Garante", value);
		this.getLegals().add(d);
	}
	
	public String getNotary() {
		return "";
	}
	
	public void setNotary(String value) {
		DetailDTO d = new DetailDTO("Escribania", value);
		this.getLegals().add(d);
	}
	
	public String getContract() {
		return "";
	}
	
	public void setContract(String value) {
		DetailDTO d = new DetailDTO("Contrato", value);
		this.getLegals().add(d);
	}
	
	public String getContractExpenses() {
		return "";
	}
	
	public void setContractExpenses(String value) {
		DetailDTO d = new DetailDTO("Gastos de contrato", value);
		this.getLegals().add(d);
	}
	
	public String getInitialDeposit() {
		return "";
	}
	
	public void setInitialDeposit(String value) {
		DetailDTO d = new DetailDTO("Deposito inicial", value);
		this.getLegals().add(d);
	}
	
	public String getAditionalLegalInfo() {
		return "";
	}
	
	public void setAditionalLegalInfo(String value) {
		DetailDTO d = new DetailDTO("Informacion adicional", value);
		this.getLegals().add(d);
	}
	
	
	public String getAditionalBathroom() {
		return "";
	}
	
	public void setAditionalBathroom(String value) {
		DetailDTO d = new DetailDTO("Baño Adicional", value);
		this.getLegals().add(d);
	}
	
	public String getGarage() {
		return "";
	}
	
	public void setGarage(String value) {
		DetailDTO d = new DetailDTO("Garage", value);
		this.getLegals().add(d);
	}
	
	public String getBalcony() {
		return "";
	}
	
	public void setBalcony(String value) {
		DetailDTO d = new DetailDTO("Balcon", value);
		this.getLegals().add(d);
	}
	
	public String getYard() {
		return "";
	}
	
	public void setYard(String value) {
		DetailDTO d = new DetailDTO("Patio", value);
		this.getLegals().add(d);
	}
	
	public String getAditionalPropertyInfo() {
		return "";
	}
	
	public void setAditionalPropertyInfo(String value) {
		DetailDTO d = new DetailDTO("Informacion adicional de la propiedad", value);
		this.getLegals().add(d);
	}
	
	
}
