package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

	final String NAME = "^[A-Z][a-z]{2,}(\\s)$";
	final String EMAIL = "^[\\w+-]+(\\.[\\w-]+)*@[^_\\W]+(\\.[^_\\W]+)?(?=(\\.[^_\\W]{3,}$|\\.[a-zA-Z]{2}$)).*$";
	final String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";
	final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=[^_\\W]*[_\\W][^_\\W]*$).{8,}$";
	
	public boolean firstName(String name) {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
		return match.matches();
	}
	
	public boolean email(String email) {
		
		Pattern pattern = Pattern.compile(EMAIL);
		Matcher match = pattern.matcher(email);
		System.out.println(match.matches());
		return match.matches();
	}
	
	public boolean phoneNumber(String phone) {
		
		Pattern pattern = Pattern.compile(PHONE);
		Matcher match = pattern.matcher(phone);
		System.out.println(match.matches());
		return match.matches();
	}
	
	public boolean password(String password) {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher match = pattern.matcher(password);
		System.out.println(match.matches());
		return match.matches();
	}
}
