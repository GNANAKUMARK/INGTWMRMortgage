package com.ing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.dao.LoanStatusRepository;
import com.ing.entity.MortgageDetails;
import com.ing.exception.DataNotFoundException;
import com.ing.request.LoanApproverStatus;
import com.ing.service.LoanStatusServiceImpl;


@RunWith(SpringRunner.class)
public class LoanStatusServiceTest {

	@Mock
	private LoanStatusRepository loanStatusRepository;
	
	@InjectMocks
	private LoanStatusServiceImpl loanStatusService;
	
	@Test
	public void updateLoanStatusSuccess() throws Exception {
		MortgageDetails mortgageDetails = new MortgageDetails();
		Optional<MortgageDetails> mortgageDetailsOptional = Optional.of(mortgageDetails);
		
		Mockito.when(
				loanStatusRepository.findById(1002)).thenReturn(mortgageDetailsOptional);
		
		Mockito.when(
				loanStatusRepository.save(mortgageDetails)).thenReturn(mortgageDetails);

		LoanApproverStatus loanApproverStatusRequest = new LoanApproverStatus(1002, "Credit", "Rejected", "Low Credit score");
		//test
		LoanApproverStatus loanApproverStatusResponse = loanStatusService.updateStatus(loanApproverStatusRequest);
         
        verify(loanStatusRepository, times(1)).findById(1002);
        verify(loanStatusRepository, times(1)).save(mortgageDetails);
        assertEquals(asJsonString(loanApproverStatusResponse), asJsonString(loanApproverStatusRequest));        
	}
	
	@Test(expected=DataNotFoundException.class)
	public void updateLoanStatusFailure() throws Exception {
		loanStatusService.updateStatus(new LoanApproverStatus(1001, "Credit", "Approved", "Good Credit score"));
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
