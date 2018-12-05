package com.powersys.alquila.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	
	private Integer price;
		
	private String type;
	
	private String expenses;//guarda "si" o "no"
	
	private String expensesValue;//guarda el valor de la expensa
	
	private String date;
	
	private String image;
	private String image2;
	private String image3;
	private String image4;
	private String image5;

	
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

	
	public void getDetails(String name, String value) {
		// TODO Auto-generated method stub
		
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", adress=" + adress + ", owner=" + owner + ", propertyDetail=" + propertyDetail
				+ ", legalDetail=" + legalDetail + ", price=" + price + ", type=" + type + ", expenses=" + expenses
				+ ", expensesValue=" + expensesValue + ", date=" + date + ", image=" + image + ", image2=" + image2
				+ ", image3=" + image3 + ", image4=" + image4 + ", image5=" + image5 + "]";
	}
	
	
	
}
