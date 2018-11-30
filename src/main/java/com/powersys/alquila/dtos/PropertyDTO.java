package com.powersys.alquila.dtos;

import org.springframework.web.multipart.MultipartFile;

public class PropertyDTO {
	//Property
	private String placeType;
	private String expenses;
	private String expensesValue;
	private String rooms;
	private Integer price;
	private String date;
	//address
	private String aStreet;
	private String aNumber;
	private String aFloor;
	private String aApartment;
	private String aAditionalInfo;
	//PropertyDetail
	private String aditionalBathroom;
	private String yard;
	private String garage2;
	private String balcony;
	private String aditionalProInfo;
	//PropertyLigalDetail
	private String guarantor;
	private String notary;
	private String contract;
	private String contractExpenses;
	private String contractExpensesValue;
	private String initialDeposit;
	private String initialDepositValue;	
	private String aditionalLegInfo;
	//Property
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

//	public String getGarage() {
//		return garage;
//	}

//	public void setGarage(String garage) {
//		this.garage = garage;
//	}

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

	public String getAditionalProInfo() {
		return aditionalProInfo;
	}

	public void setAditionalProInfo(String aditionalProInfo) {
		this.aditionalProInfo = aditionalProInfo;
	}

	public String getContractExpensesValue() {
		return contractExpensesValue;
	}

	public void setContractExpensesValue(String contractExpensesValue) {
		this.contractExpensesValue = contractExpensesValue;
	}

	public String getInitialDepositValue() {
		return initialDepositValue;
	}

	public void setInitialDepositValue(String initialDepositValue) {
		this.initialDepositValue = initialDepositValue;
	}

	public String getAditionalLegInfo() {
		return aditionalLegInfo;
	}

	public void setAditionalLegInfo(String aditionalLegInfo) {
		this.aditionalLegInfo = aditionalLegInfo;
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

	public String getExpensesValue() {
		return expensesValue;
	}

	public void setExpensesValue(String expensesValue) {
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

	public String getGarage2() {
		return garage2;
	}

	public void setGarage2(String garage2) {
		this.garage2 = garage2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
