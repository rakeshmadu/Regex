package com.user;

import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the Last name: ");
		String name = scan.nextLine();
		
		UserDetails userDetails = new UserDetails();
		userDetails.LastName(name);
		scan.close();
	}
}
