package com.example.dummyservice;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DummyServiceApplicationTests {

	Logger logger = LoggerFactory.getLogger(DummyServiceApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("====> TEST CASE EXECUTING...");
		logger.info("====> TEST CAST EXECUTING SECOND TIME...");
		assertEquals(true,true); //dummy test cases to check it in jenkins
	}

}
