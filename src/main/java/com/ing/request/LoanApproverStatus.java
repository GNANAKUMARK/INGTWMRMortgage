package com.ing.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Setter @Getter @ToString
public class LoanApproverStatus {

	private Integer id;
	private String role;
	private String status;
	private String reason;
	
	public LoanApproverStatus(Integer id, String role, String status, String reason) {
		super();
		this.id = id;
		this.role = role;
		this.status = status;
		this.reason = reason;
	}
	
}
