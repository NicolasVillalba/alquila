package com.powersys.alquila.dtos;

import com.powersys.alquila.dtos.DetailDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.dom.Text;

public class PropertyDTO {

	private String placeType;
	private String expenses;
	private Integer expensesValue;
	private String rooms;
	private Integer price;
	private String aStreet;
	private String aNumber;
	private String aFloor;
	private String aApartment;
	private String aAditionalInfo;
	private String aditionalBathroom;
	private String yard;
	private String garage;
	private String balcony;
	private String aditionalProInfo;
	private String guarantor;
	private String notary;
	private String contract;
	private String contractExpenses;
	private Integer contractExpensesValue;
	private String initialDeposit;
	private Integer initialDepositValue;	
	private String aditionalLegInfo;
	private MultipartFile image;
	private MultipartFile image2;
	private MultipartFile image3;
	private MultipartFile image4;
	private MultipartFile image5;
	private String path;
	private String path2;
	private String path3;
	private String path4;
	private String path5;
	
	
	
	
	// private List<DetailDTO> aDetails = new ArrayList<>();
	// private List<DetailDTO> pDetails = new ArrayList<>();
	private List<String> photos;
	
	private List<DetailDTO> legals = new ArrayList<>();
	

	public void addDetail(String name, String value) {
		this.legals.add(new DetailDTO(name, value));
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
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

	

	public List<DetailDTO> getLegals() {
		return legals;
	}

	
		

	public String getGuarantor() {
		return guarantor;
	}	

	

	public String getNotary() {
		return notary;
	}

	public void setNotary(String notary) {
		this.notary = notary;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getContractExpenses() {
		return contractExpenses;
	}

	public void setContractExpenses(String contractExpenses) {
		this.contractExpenses = contractExpenses;
	}

	public String getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(String initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public String getAditionalBathroom() {
		return aditionalBathroom;
	}

	public void setAditionalBathroom(String aditionalBathroom) {
		this.aditionalBathroom = aditionalBathroom;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getAditionalPropertyInfo() {
		return "";
	}

	public void setAditionalPropertyInfo(String value) {
		DetailDTO d = new DetailDTO("Informacion adicional de la propiedad", value);
		this.getLegals().add(d);
	}

	public String getAditionalProInfo() {
		return aditionalProInfo;
	}

	public void setAditionalProInfo(String aditionalProInfo) {
		this.aditionalProInfo = aditionalProInfo;
	}

	public Integer getContractExpensesValue() {
		return contractExpensesValue;
	}

	public void setContractExpensesValue(Integer contractExpensesValue) {
		this.contractExpensesValue = contractExpensesValue;
	}

	public Integer getInitialDepositValue() {
		return initialDepositValue;
	}

	public void setInitialDepositValue(Integer initialDepositValue) {
		this.initialDepositValue = initialDepositValue;
	}

	public String getAditionalLegInfo() {
		return aditionalLegInfo;
	}

	public void setAditionalLegInfo(String aditionalLegInfo) {
		this.aditionalLegInfo = aditionalLegInfo;
	}

	public void setLegals(List<DetailDTO> legals) {
		this.legals = legals;
	}

	public String getaFloor() {
		return aFloor;
	}

	public void setaFloor(String aFloor) {
		this.aFloor = aFloor;
	}

	public String getaApartment() {
		return aApartment;
	}

	public void setaApartment(String aApartment) {
		this.aApartment = aApartment;
	}

	public String getExpenses() {
		return expenses;
	}

	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}

	public Integer getExpensesValue() {
		return expensesValue;
	}

	public void setExpensesValue(Integer expensesValue) {
		this.expensesValue = expensesValue;
	}

	public String getaAditionalInfo() {
		return aAditionalInfo;
	}

	public void setaAditionalInfo(String aAditionalInfo) {
		this.aAditionalInfo = aAditionalInfo;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
}

	public MultipartFile getImage2() {
		return image2;
	}

	public void setImage2(MultipartFile image2) {
		this.image2 = image2;
	}

	public MultipartFile getImage3() {
		return image3;
	}

	public void setImage3(MultipartFile image3) {
		this.image3 = image3;
	}

	public MultipartFile getImage4() {
		return image4;
	}

	public void setImage4(MultipartFile image4) {
		this.image4 = image4;
	}

	public MultipartFile getImage5() {
		return image5;
	}

	public void setImage5(MultipartFile image5) {
		this.image5 = image5;
	}

	public String getPath2() {
		return path2;
	}

	public void setPath2(String path2) {
		this.path2 = path2;
	}

	public String getPath3() {
		return path3;
	}

	public void setPath3(String path3) {
		this.path3 = path3;
	}

	public String getPath4() {
		return path4;
	}

	public void setPath4(String path4) {
		this.path4 = path4;
	}

	public String getPath5() {
		return path5;
	}

	public void setPath5(String path5) {
		this.path5 = path5;
	}


}
