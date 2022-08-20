package com.test;

import com.user.UserDetails;
import org.junit.Test;

public class RegexJunit {

	@Test
	public void firstNameHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.firstName("rakesh");
		assertEquals(true, output);
	}
	
	@Test
	public void firstNameSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.firstName("rakesh");
		assertEquals(false, output);
	}
	
	@Test
	public void phoneNumberHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.phoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	
	@Test
	public void phoneNumberSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.phoneNumber("abcdeg123");
		assertEquals(false, output);
	}
	
	@Test
	public void passwordHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.password("rakesh@123P");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.password("rakesh@123q");
		assertEquals(false, output);
	}
	
	@Test
	public void emailHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.email("rakesh123@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.email("rakeshgmail.com");
		assertEquals(false, output);
	}

	private void assertEquals(boolean b, boolean output) {
	}

}
