package com.ing.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveMortgageRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private String address;
	private String ssn;
	private Double assests;
	private Double liabilities;
	@JsonProperty(value = "Tenure")
	private Integer tenure;
	private String creditStatus;
	private Double applicantIncome;
	private Double loanAmount;
	private String emailId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Double getAssests() {
		return assests;
	}
	public void setAssests(Double assests) {
		this.assests = assests;
	}
	public Double getLiabilities() {
		return liabilities;
	}
	public void setLiabilities(Double liabilities) {
		this.liabilities = liabilities;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public String getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	public Double getApplicantIncome() {
		return applicantIncome;
	}
	public void setApplicantIncome(Double applicantIncome) {
		this.applicantIncome = applicantIncome;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
