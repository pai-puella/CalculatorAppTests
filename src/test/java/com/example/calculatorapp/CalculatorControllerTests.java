package com.example.calculatorapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringJUnitConfig
@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTests {

	@Autowired
	private final MockMvc mockMvc;

	@Mock
	private CalculatorService calculatorService;

	CalculatorControllerTests(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testAdd() throws Exception {
		when(calculatorService.add(2, 3)).thenReturn("5");

		mockMvc.perform(MockMvcRequestBuilders.get("/add")
						.param("num1", "2")
						.param("num2", "3")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("5"));
	}

	@Test
	public void testSubtract() throws Exception {
		when(calculatorService.subtract(5, 3)).thenReturn("2");

		mockMvc.perform(MockMvcRequestBuilders.get("/subtract")
						.param("num1", "5")
						.param("num2", "3")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("2"));
	}

	@Test
	public void testMultiply() throws Exception {
		when(calculatorService.multiply(2, 3)).thenReturn("6");

		mockMvc.perform(MockMvcRequestBuilders.get("/multiply")
						.param("num1", "2")
						.param("num2", "3")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("6"));
	}

	@Test
	public void testDivide() throws Exception {
		when(calculatorService.divide(6, 3)).thenReturn("2");

		mockMvc.perform(MockMvcRequestBuilders.get("/divide")
						.param("num1", "6")
						.param("num2", "3")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("2"));
	}
}

