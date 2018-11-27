package com.powersys.alquila.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "legalDetail")
public class LegalDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String guarantor;
	private String notary;
	private String contract;
	private String contractExpenses;
	private String contractExpensesValue;
	private String initialDeposit;
	private String initialDepositValue;	
	private String aditionalInfo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
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

	public String getContractExpensesValue() {
		return contractExpensesValue;
	}

	public void setContractExpensesValue(String contractExpensesValue) {
		this.contractExpensesValue = contractExpensesValue;
	}

	public String getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(String initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public String getInitialDepositValue() {
		return initialDepositValue;
	}

	public void setInitialDepositValue(String initialDepositValue) {
		this.initialDepositValue = initialDepositValue;
	}

	public String getAditionalInfo() {
		return aditionalInfo;
	}

	public void setAditionalInfo(String aditionalInfo) {
		this.aditionalInfo = aditionalInfo;
	}

}
