package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	
	final String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";
	
	public void phoneNumber(String phone) {
		
		Pattern pattern = Pattern.compile(PHONE);
		Matcher match = pattern.matcher(phone);
		System.out.println(match.matches());
	}
}
