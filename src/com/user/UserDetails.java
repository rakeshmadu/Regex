package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	
	final String PASSWORD = "^.{8,}$";
	
	
	public void password(String password) {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher match = pattern.matcher(password);
		System.out.println(match.matches());
	}
}
