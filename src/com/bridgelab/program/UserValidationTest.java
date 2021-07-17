package com.bridgelab.program;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UserValidationTest {
	UserValidation user = new UserValidation();
	
	@Test
	void givenFirst_Name_whenValid_shouldReturn(){
		boolean result = user.firstName("Kuldeep");
		assertEquals(true ,result);
		
	}
	@Test
	void givenLast_Name_whenValid_shouldReturns() {
		boolean result = user.lastName("Pandey");
		assertEquals(true ,result);
		
	}
	@Test
	void givenNumber_whenValid_shouldReturns() {
		boolean result = user.mobileNumber("9723846921");
		assertEquals(true ,result);
		
	}
	
	@Test
	void givenEmail_whenValid_shouldReturns() {
		boolean result = user.emailId("pandeykuldeep525@gmail.com");
		assertEquals(true ,result);
		
	}
	@Test
	void givenPassword_whenValid_shouldReturns() {
		boolean result = user. passwordCase4("Kuldeep525@");
		assertEquals(true ,result);
		
	}
}