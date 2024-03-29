package com.ing.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ing.dao.MortgageDao;
import com.ing.entity.MortgageDetails;
import com.ing.request.MortgageRequest;
import com.ing.request.SaveMortgageRequest;
import com.ing.response.SaveMortgageResponse;
import com.ing.utils.MortgageUtils;

@Service
@Transactional
public class MortgageServiceImpl implements MortgageService {

	@Autowired
	MortgageDao repo;

	@Override
	public SaveMortgageResponse saveMortgageDetails(SaveMortgageRequest request) {
		MortgageDetails details = new MortgageDetails();
		SaveMortgageResponse response = new SaveMortgageResponse();
		details.setAddress(request.getAddress());
		details.setApplicantIncome(request.getApplicantIncome());
		details.setAssests(request.getAssests());
		details.setEmailId(request.getEmailId());
		details.setFirstName(request.getFirstName());
		details.setLastName(request.getLastName());
		details.setLiabilites(request.getLiabilities());
		details.setLoanAmount(request.getLoanAmount());
		details.setMobile(request.getMobileNumber());
		details.setSsn(request.getSsn());
		details.setTenure(request.getTenure());
		details.setStatus(MortgageUtils.STATUS_INREVIEW);
		details.setCreateTime(LocalDateTime.now());
		details = repo.save(details);
		response.setMessage(MortgageUtils.SAVE_RESPONSE + details.getId());
		return response;
	}

	

	public List<MortgageDetails> findAll() {        return repo.findAll();    }

	public MortgageDetails findDetailsById(int id) {      
		return repo.findById(id).orElse(null);     
		}
	public MortgageDetails updateDetails(int id,MortgageRequest request) {  
		MortgageDetails details = new MortgageDetails();       
		BeanUtils.copyProperties(request,details);       
		details.setId(id);       
		//details.setTenure(2);        
		return repo.save(details); 
		}
}
