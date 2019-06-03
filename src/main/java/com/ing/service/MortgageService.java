package com.ing.service;

import com.ing.request.SaveMortgageRequest;
import com.ing.response.SaveMortgageResponse;

public interface MortgageService {
	public SaveMortgageResponse saveMortgageDetails(SaveMortgageRequest request);
}
