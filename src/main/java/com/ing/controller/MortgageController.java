package com.ing.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.entity.MortgageDetails;
import com.ing.exception.DataNotFoundException;
import com.ing.request.MortgageRequest;
import com.ing.request.SaveMortgageRequest;
import com.ing.response.MortgageResponse;
import com.ing.response.SaveMortgageResponse;
import com.ing.service.MortgageService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MortgageController {
	@Autowired
	MortgageService service;
	private static final Logger LOGGER = LogManager.getLogger(MortgageController.class);

	@PostMapping(value = "/applications")
	public ResponseEntity<SaveMortgageResponse> saveMortgageDetails(@RequestBody SaveMortgageRequest request)
			throws Exception {
		LOGGER.info("inside Controller saveMortgageDetails");
		SaveMortgageResponse response = null;
		try {
			response = service.saveMortgageDetails(request);
		} catch (Exception e) {
			LOGGER.error(e);
			throw e;
		}
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/applications")
	public ResponseEntity<List<MortgageDetails>> loadApplication() {
		List<MortgageDetails> list = service.findAll();
		return new ResponseEntity<List<MortgageDetails>>(list, HttpStatus.OK);
	}

	@GetMapping("/applications/{id}")
	public ResponseEntity<MortgageDetails> loadApplicationById(@PathVariable("id") int id)
			throws DataNotFoundException {
		MortgageDetails detail = service.findDetailsById(id);
		if (detail == null || detail.getId() <= 0) {
			throw new DataNotFoundException("No Data Found for id" + id);
		}
		return new ResponseEntity<MortgageDetails>(detail, HttpStatus.OK);
	}



@PutMapping(value="/applications/{id}",consumes = MediaType.APPLICATION_JSON_VALUE) 
public ResponseEntity<MortgageResponse> updateMortgageDetail(@PathVariable("id") int id,@RequestBody MortgageRequest request)            throws DataNotFoundException{
	LOGGER.info("Enter SampleController::test");     
	LOGGER.debug("in side test method");    
	MortgageResponse response = new MortgageResponse();  
	MortgageDetails details = service.updateDetails(id,request);   
	if(details==null || details.getId()==null) {           
		throw new DataNotFoundException("data not found");     
		}        response.setMessage("Updated Successfully");      
		return new ResponseEntity<MortgageResponse>(response,HttpStatus.OK);  
		}

}