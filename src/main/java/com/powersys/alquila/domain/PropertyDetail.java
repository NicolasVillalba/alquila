package com.powersys.alquila.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propertyDetail")
public class PropertyDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String rooms;
	private String aditionalBathroom;
	private String yard;
	private String balcony;
	private String garage;
	private String aditionalInfo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAditionalBathroom() {
		return aditionalBathroom;
	}
	public void setAditionalBathroom(String aditionalBathroom) {
		this.aditionalBathroom = aditionalBathroom;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getBalcony() {
		return balcony;
	}
	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getAditionalInfo() {
		return aditionalInfo;
	}

	public void setAditionalInfo(String aditionalInfo) {
		this.aditionalInfo = aditionalInfo;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

}
