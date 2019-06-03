package com.ing.service;

import java.util.List;

import com.ing.entity.MortgageDetails;
import com.ing.request.SaveMortgageRequest;
import com.ing.response.SaveMortgageResponse;

public interface MortgageService {
	public SaveMortgageResponse saveMortgageDetails(SaveMortgageRequest request);
	List<MortgageDetails> findAll();
	MortgageDetails findDetailsById(int id);
}
