package com.ing;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ing.dao.MortgageDao;
import com.ing.entity.MortgageDetails;
import com.ing.request.MortgageRequest;
import com.ing.response.MortgageResponse;
import com.ing.service.MortgageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = INGTWMRMortgageApplication.class)
public class MortgageServiceTest {
	@Mock
	MortgageDao dao;
	@InjectMocks
	MortgageServiceImpl service;

	@Test    public void getUpdateDetails() {                       
		MortgageRequest request= new MortgageRequest(3,"Raaju","Bhai", null, null, null, null, null, 0, null, null, null, null, null, null, null);          
		MortgageDetails details = new MortgageDetails(3,"Raaju","Bhai", null, null, null, null, null, 0, null, null, null, null, null, null, null);          Mockito.when(dao.save(details)).thenReturn(details);          MortgageDetails result =service.updateDetails(details.getId(),request);       
		assertEquals(details.getId(),request.getId());        
		assertThat(details.getId()).isEqualTo(request.getId());    }
}