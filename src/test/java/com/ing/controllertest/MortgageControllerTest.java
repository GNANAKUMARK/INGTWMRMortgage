package com.ing.controllertest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ing.controller.MortgageController;
import com.ing.entity.MortgageDetails;
import com.ing.service.MortgageService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MortgageControllerTest {
	private MockMvc mvc;
	@MockBean
	MortgageService service;
	@InjectMocks
	MortgageController controller;
	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void verifyAllApplicationList() throws Exception {
		List<MortgageDetails> details = new ArrayList<>();
		details.add(new MortgageDetails(1, "karthik", "raja", 1234567L, "kka45", "salem", 1000.0, 12288.0,
				"kartjik@gmail.com"));
		Mockito.when(service.findAll()).thenReturn(details);
		mvc.perform(MockMvcRequestBuilders.get("/applications").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].id").isNotEmpty()).andDo(print());
	}

	@Test  
	public void verifyAllApplicationById() throws Exception {           
		MortgageDetails details=new MortgageDetails(1,"karthik","raja",1234567L,"kka45","salem",1000.0,12288.0,"kartjik@gmail.com");        Mockito.when(service.findDetailsById(1)).thenReturn(details);        mvc.perform(MockMvcRequestBuilders.get("/applications/{id}",1).accept(MediaType.APPLICATION_JSON))            .andExpect(jsonPath("$.id").isNotEmpty()).andDo(print());    } // @Test public void whenFileNotFound() throws Exception {
	}
	// Mockito.when(service.findDetailsById(1)).thenReturn(null);
	// mvc.perform(get("/applications/{id}", 1))
	// .andExpect(status().isNotFound()).andDo(print()); } public static String
	// asJsonString(final Object obj) { try { return new
	// ObjectMapper().writeValueAsString(obj); } catch (Exception e) { throw new
	// RuntimeException(e); } } }