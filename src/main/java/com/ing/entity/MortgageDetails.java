package com.ing.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mortgage_Details")
public class MortgageDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Mobile")
	private Long mobile;
	
	@Column(name = "SSN")
	private String ssn;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Applicant_Income")
	private Double applicantIncome;
	
	@Column(name="Loan_Amount")
	private Double loanAmount;
	
	@Column(name="Tenure")
	private int tenure;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name = "EmailId")
	private String emailId;
	
	@Column(name="Assests")
	private Double assests;
	
	@Column(name="Liabilites")
	private Double liabilites;
	
	@Column(name="Created_Time")
	private LocalDateTime createTime;
	
	@Column(name="Updated_Time")
	private LocalDateTime updatedTime;

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

	public Double getLiabilites() {
		return liabilites;
	}

	public void setLiabilites(Double liabilites) {
		this.liabilites = liabilites;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(LocalDateTime updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	

}
