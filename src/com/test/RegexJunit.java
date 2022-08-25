package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.exception.InvalidEmailException;
import com.exception.InvalidNameException;
import com.exception.InvalidPasswordException;
import com.exception.InvalidPhoneNumberException;
import com.user.UserDetails;

@RunWith(Parameterized.class)
public class RegexJunit {

	String input;
	boolean expectedResult;
	UserDetails userDetails;

	public RegexJunit(String input, boolean expectedResult) {

//		userDetails = new UserDetails();
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Before
	public void firstThing() {
		userDetails = new UserDetails();
	}
	
	@Parameters
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
	public void testEmail() throws InvalidEmailException {
		assumeTrue(expectedResult == true);
		boolean output = userDetails.emailValidation.emailValidation(input);
		assertEquals(expectedResult, output);
	}

	@Test(expected = InvalidEmailException.class)
	public void testEmailSad() throws InvalidEmailException {
		assumeTrue(expectedResult == false);
		userDetails.emailValidation.emailValidation(input);
	}

	@Test
	public void firstNameHappy() throws InvalidNameException {
		boolean output = userDetails.nameValidation.nameValidation("Rakesh");
		assertEquals(true, output);
	}
	@Test
	public void lastNameHappy() throws InvalidNameException {
		boolean output = userDetails.nameValidation.nameValidation("Madu");
		assertEquals(true, output);
	}

	@Test(expected = InvalidNameException.class)
	public void firstNameSad() throws InvalidNameException {
		userDetails.nameValidation.nameValidation("rakesh");
	}

	@Test(expected = InvalidNameException.class)
	public void lastNameSad() throws InvalidNameException {
		userDetails.nameValidation.nameValidation("madu");
	}

	@Test
	public void phoneNumberHappy() throws InvalidPhoneNumberException {
		boolean output = userDetails.phoneValidation.phoneValidation("91 1234567890");
		assertEquals(true, output);
	}

	@Test(expected = InvalidPhoneNumberException.class)
	public void phoneNumberSad() throws InvalidPhoneNumberException {
		userDetails.phoneValidation.phoneValidation("1234567890qwwe");
	}

	@Test
	public void passwordHappy() throws InvalidPasswordException {
		boolean output = userDetails.passwordValidation.passwordValidation("Abcd@123");
		assertEquals(true, output);
	}

	@Test(expected = InvalidPasswordException.class)
	public void passwordSad() throws InvalidPasswordException {
		userDetails.passwordValidation.passwordValidation("abcd1234");
	}

	@Test
	public void emailHappy() throws InvalidEmailException {
		boolean output = userDetails.emailValidation.emailValidation("rakesh@gmail.com");
		assertEquals(true, output);
	}

	@Test(expected = InvalidEmailException.class)
	public void emailSad() throws InvalidEmailException {
		userDetails.emailValidation.emailValidation("rakeshgmail.com");
	}

}
