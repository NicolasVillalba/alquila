package com.powersys.alquila.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.thymeleaf.dom.Text;

@Entity
@Table(name = "property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Address adress;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Owner owner;

	@OneToOne(cascade = CascadeType.PERSIST)
	private PropertyDetail propertyDetail;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private LegalDetail legalDetail;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Detail> details;

	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Detail> legals;

	private Integer price;
		
	private String type;
	
	private String expenses;
	
	private Integer expensesValue;
	
	private String image;

	@ElementCollection
	private List<String> images = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public PropertyDetail getPropertyDetail() {
		return propertyDetail;
	}

	public void setPropertyDetail(PropertyDetail propertyDetail) {
		this.propertyDetail = propertyDetail;
	}
	
	public LegalDetail getLegalDetail() {
		return legalDetail;
	}

	public void setLegalDetail(LegalDetail legalDetail) {
		this.legalDetail = legalDetail;
	}

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public List<Detail> getLegals() {
		return legals;
	}

	public void setLegals(List<Detail> legals) {
		this.legals = legals;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getImages() {
		return images;
	}

	public void addImage(String imageUrl) {
		this.images.add(imageUrl);
	}

	public void getDetails(String name, String value) {
		// TODO Auto-generated method stub
		
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	

	
}
