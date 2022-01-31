package com.ayo.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class AyoConvertorApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void contextLoads() throws Exception {
		
		mockMvc.perform(get("/api/fahrenheit/celsius/100"))
		.andDo(print())
		.andExpect(status().is(200))
		.andExpect(content().string(equalTo("50.00")));

	}

}
