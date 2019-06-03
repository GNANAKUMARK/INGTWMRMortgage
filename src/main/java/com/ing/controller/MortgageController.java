package com.ing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.request.SaveMortgageRequest;
import com.ing.response.SaveMortgageResponse;
import com.ing.service.MortgageService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MortgageController {
	@Autowired
	MortgageService service;
	private static final Logger LOGGER = LogManager.getLogger(MortgageController.class);

	@PostMapping(value = "/applications")
	public ResponseEntity<SaveMortgageResponse> saveMortgageDetails(@RequestBody SaveMortgageRequest request) throws Exception{
		LOGGER.info("inside Controller saveMortgageDetails");
		SaveMortgageResponse response = null;
		try {
		response =  service.saveMortgageDetails(request);
		} catch(Exception e) {
			LOGGER.error(e);
			throw e;
		}
		return new ResponseEntity<SaveMortgageResponse>(response,HttpStatus.OK);
		
	}

}