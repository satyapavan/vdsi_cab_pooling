package org.springframework.samples.mvc.simple;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.verizon.cab.management.web.controllers.CabController;

import org.junit.Test;

public class CabControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(CabControllerTest.class);

	/*	@Test
	public void indexTest() throws Exception {
		logger.info("Inside updateTest");
		standaloneSetup(new CabController()).build()
		.perform(get("/"))
		.andExpect(content().string(""));
	}*/
	@Test
	public void loginTest() throws Exception {
		logger.info("Inside loginTest");
		standaloneSetup(new CabController()).build()
		.perform(post("/login"))
		.andExpect(content().string(""));
	}
	@Test
	public void updateTest() throws Exception {
		logger.info("Inside updateTest");
		standaloneSetup(new CabController()).build()
		.perform(post("/update"))
		.andExpect(content().string(""));
	}

	@Test
	public void registerTest() throws Exception {
		logger.info("Inside registerTest");
		standaloneSetup(new CabController()).build()
		.perform(post("/register"))
		.andExpect(content().string(""));
	}
	@Test
	public void reportTest() throws Exception {
		logger.info("Inside reportTest");
		standaloneSetup(new CabController()).build()
		.perform(get("/report"))
		.andExpect(content().string(""));
	}

	@Test
	public void submitRequestTest() throws Exception {
		logger.info("Inside submitRequestTest");
		standaloneSetup(new CabController()).build()
		.perform(post("/submitRequest"))
		.andExpect(content().string(""));
	}
}