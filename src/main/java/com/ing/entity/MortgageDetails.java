package com.ing.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MortgageDetails implements Serializable {
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

	@Column(name = "Address")
	private String address;

	@Column(name = "Applicant_Income")
	private Double applicantIncome;

	@Column(name = "Loan_Amount")
	private Double loanAmount;

	@Column(name = "Tenure")
	private Integer tenure;

	@Column(name = "Status")
	private String status;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "EmailId")
	private String emailId;

	@Column(name = "Assests")
	private Double assests;

	@Column(name = "Liabilites")
	private Double liabilites;

	@Column(name = "Created_Time")
	private LocalDateTime createTime = LocalDateTime.now();

	@Column(name = "Updated_Time", nullable = true)
	private LocalDateTime updatedTime;

	public MortgageDetails(int id, String firstName, String lastName, Long mobile, String ssn, String address,
			Double applicantIncome, Double loanAmount, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.ssn = ssn;
		this.address = address;
		this.applicantIncome = applicantIncome;
		this.loanAmount = loanAmount;
		this.emailId = emailId;
	}
}
