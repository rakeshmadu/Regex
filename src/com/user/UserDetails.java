package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

	final String EMAIL = "^[\\w-]+(\\.[\\w-]+)*@[^_\\W]+(\\.[^_\\W]+)?(?=(\\.[^_\\W]{3,}$|\\.[a-zA-Z]{2}$)).*$";

	public void email(String email) {

		Pattern pattern = Pattern.compile(EMAIL);
		Matcher match = pattern.matcher(email);
		System.out.println(match.matches());
	}

}
