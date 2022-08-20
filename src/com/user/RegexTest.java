package com.user;

import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the password: ");
		String password = scan.nextLine();
		
		UserDetails userDetails = new UserDetails();
		userDetails.password(password);
		scan.close();
	}
}
