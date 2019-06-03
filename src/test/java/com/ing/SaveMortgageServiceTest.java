package com.ing;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ing.dao.MortgageDao;
import com.ing.entity.MortgageDetails;
import com.ing.request.SaveMortgageRequest;
import com.ing.response.SaveMortgageResponse;
import com.ing.service.MortgageService;
import com.ing.service.MortgageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SaveMortgageServiceTest {

	@Mock
	MortgageDao repo;
	
	@InjectMocks
	MortgageServiceImpl service;
	
	@Test
	public void saveMortgageDetails() {
		MortgageDetails details = new MortgageDetails();
		details.setId(1);
		Mockito.when(repo.save(Matchers.any())).thenReturn(details);
		SaveMortgageResponse response =  service.saveMortgageDetails(new SaveMortgageRequest());
		assertNotNull(response.getMessage());
	}

}
