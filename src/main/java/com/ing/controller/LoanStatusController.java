package com.ing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.request.LoanApproverStatus;
import com.ing.service.LoanStatusService;

@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanStatusController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoanStatusController.class);
	
	@Autowired
	private LoanStatusService loanStatusService;

	@PutMapping(path="/status")
	public ResponseEntity<LoanApproverStatus> updateStatus(@RequestBody LoanApproverStatus loanApproverStatus) {
		logger.info("inside LoanStatusController updateStatus()");
		loanStatusService.updateStatus(loanApproverStatus);
		logger.info("status updated");
		return new ResponseEntity<>(loanApproverStatus, HttpStatus.OK);
	}

}
