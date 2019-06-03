package com.ing.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.controller.LoanStatusController;
import com.ing.dao.LoanStatusRepository;
import com.ing.entity.MortgageDetails;
import com.ing.exception.DataNotFoundException;
import com.ing.request.LoanApproverStatus;

@Service
public class LoanStatusServiceImpl implements LoanStatusService {

	private static final Logger logger = LoggerFactory.getLogger(LoanStatusController.class);

	@Autowired
	private LoanStatusRepository loanStatusRepository;

	public LoanApproverStatus updateStatus(LoanApproverStatus loanApproverStatus) {
		logger.info("inside LoanStatusServiceImpl updateStatus()");
		MortgageDetails mortgageDetails = loanStatusRepository.findById(loanApproverStatus.getId()).orElse(null);
		if(mortgageDetails == null) {
			logger.error("Loan Id not found in the system");
			throw new DataNotFoundException("Failed to update the loan status, Loan Id not found in the system");
		}
		mortgageDetails.setStatus(loanApproverStatus.getStatus());
		mortgageDetails.setUpdatedBy(loanApproverStatus.getRole());
		mortgageDetails.setUpdatedTime(LocalDateTime.now());

		loanStatusRepository.save(mortgageDetails);
		logger.error("Loan status updated in the system");
		return loanApproverStatus;
	}

}
