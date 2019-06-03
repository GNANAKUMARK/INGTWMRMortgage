package com.ing;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.controller.LoanStatusController;
import com.ing.request.LoanApproverStatus;
import com.ing.service.LoanStatusService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = LoanStatusController.class, secure = false)
public class LoanStatusControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LoanStatusService loanStatusService;

	@Test
	public void updateLoanStatusSuccess() throws Exception {

		LoanApproverStatus loanApproverStatus = new LoanApproverStatus(101, "Credit", "Rejected", "Low Credit score");
		
		Mockito.when(
				loanStatusService.updateStatus(loanApproverStatus)).thenReturn(loanApproverStatus);

		mockMvc.perform(put("/api/status")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(loanApproverStatus)))
				.andExpect(status().isOk());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


}
