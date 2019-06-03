package com.ing.response;

import java.io.Serializable;

//@Getter @ Setter @NoArgsConstructor
public class SaveMortgageResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
