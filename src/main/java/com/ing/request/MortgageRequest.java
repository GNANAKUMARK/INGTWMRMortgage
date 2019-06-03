package com.ing.request;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MortgageRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobile;
	private String ssn;
	private String address;
	private Double applicantIncome;
	private Double loanAmount;
	private int tenure;
	private String status;
	private String updatedBy;
	private String emailId;
	private Double assests;
	private Double liabilities;
	@JsonIgnore
	private LocalDate createdTime;
	@JsonIgnore
	private LocalDate updatedTime;

	public MortgageRequest() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public LocalDate getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDate createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDate getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(LocalDate updatedTime) {
		this.updatedTime = updatedTime;
	}

	public MortgageRequest(Integer id, String firstName, String lastName, Long mobile, String ssn, String address,            Double applicantIncome, Double loanAmount, int tenure, String status, String updatedBy, String emailId,            Double assests, Double liabilities, LocalDate createdTime, LocalDate updatedTime) {        super();        this.id = id;        this.firstName = firstName;        this.lastName = lastName;        this.mobile = mobile;        this.ssn = ssn;        this.address = address;        this.applicantIncome = applicantIncome;        this.loanAmount = loanAmount;        this.tenure = tenure;        this.status = status;        this.updatedBy = updatedBy;        this.emailId = emailId;        this.assests = assests;        this.liabilities = liabilities;        this.createdTime = createdTime;        this.updatedTime = updatedTime;
	
	}
}

