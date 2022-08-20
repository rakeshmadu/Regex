package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserDetails {
	
	final String LAST_NAME = "^[A-Z][a-z]{2,}$";

	public void LastName(String name) {
		
		Pattern pattern = Pattern.compile(LAST_NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
		
	}
}