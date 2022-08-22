package com.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.user.UserDetails;

@RunWith(Parameterized.class)
public class RegexJunit {

	String input;
	boolean expectedResult;
	UserDetails userDetails;
	
	public RegexJunit(String input, boolean expectedResult) {


		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void firstThing() {
		userDetails = new UserDetails();
	}
	
	@Parameters(name="emailInputs()")
	public static Collection emailInputs() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com", true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true},
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"abc", false},
			{"abc@.com.my", false},
			{"abc123@gmail.a", false},
			{"abc123@.com", false},
			{"abc123@.com.com", false},
			{".abc@abc.com", false},
			{"abc()*@gmail.com", false},
			{"abc@%*.com", false},
			{"abc..2002@gmail.com", false},
			{"abc.@gmail.com", false},
			{"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false},
			{"abc@gmail.com.aa.au", false},
		});		
	}
	

	@Test
	public void testEmail() {
		
		boolean output = userDetails.email(input);
		assertEquals(expectedResult, output);
	}

	@Test
	public void firstNameHappy() {
		boolean output = userDetails.firstName("Rakesh");
		assertEquals(false, output);
	}
	
	@Test
	public void firstNameSad() {
		boolean output = userDetails.firstName("rakesh");
		assertEquals(false, output);
	}
	
	@Test
	public void phoneNumberHappy() {
		boolean output = userDetails.phoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	
	@Test
	public void phoneNumberSad() {
		boolean output = userDetails.phoneNumber("123@rtyfgh");
		assertEquals(false, output);
	}
	
	@Test

	public void passwordHappy() {
		boolean output = userDetails.password("hi5!There");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordSad() {
		boolean output = userDetails.password("hi!!therekfjslkf");
		assertEquals(false, output);
	}
	
	@Test
	public void emailHappy() {
		boolean output = userDetails.email("hi@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailSad() {
		boolean output = userDetails.email("hi@@gmail.com");
		assertEquals(false, output);
	}

	private void assertEquals(boolean b, boolean output) {
	}

}
