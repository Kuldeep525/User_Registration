package com.bridgelab.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class  UserValidation{
	
	private static String INVALID_FIRST_NAME;
	public static final String TypesOfException = INVALID_FIRST_NAME ;
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome to user validator----");
		UserValidation user = new UserValidation();
		System.out.println("Enter your valid first name ");
		String name = sc.next();
		user.firstName(name);
		System.out.println("Enter your valid Last name ");
		String lastName = sc.next();
		user.lastName(lastName);
		System.out.println(" Enter your valid Email");
		String email = sc.next();
		user.emailId(email);
		System.out.println("Enter your valid  mobile number ");
		String number = sc.next();
		user.mobileNumber(number);
		System.out.println("Enter your valid  password ");
		String password = sc.next();
		user.passwordCase1(password);
		System.out.println("Enter your valid  password ");
		String password1 = sc.next();
		user.passwordCase2(password1);
		System.out.println("Enter your valid  password ");
		String password2 = sc.next();
		user.passwordCase3(password2);
		System.out.println("Enter your valid  password ");
		String password3 = sc.next();
		user.passwordCase4(password3);
		System.out.println("Enter your email to be validate  ");
		String emailcheck = sc.next();
		user.emailCheck(email);
	}
	
	public boolean firstName(String name) {
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{2,}", name);
		if(correct) {
			System.out.println("First name inserted successfully");
			
		}else {
			System.out.println("Invalid name ");
		}
		return correct;	
		
	}
	
	
	public boolean lastName(String name) {
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{2,}", name);
		if(correct) {
			System.out.println("Last name inserted successfully");
			
		}else {
			System.out.println("Invalid name ");
		}
		return correct;	
		
	}
	
	public boolean emailId(String email) {
	
		boolean  correct = Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
		if(correct) {
			System.out.println("Email inserted successfully");
			
		}else {
			System.out.println("Invalid Emailid ");
		}
		return correct;	
		
	}
	public boolean mobileNumber(String number) {
		
		boolean  correct = Pattern.matches("[987]{1}\\d{9}", number);
		if(correct) {
			System.out.println("Mobile Number  inserted successfully");
			
		}else {
			System.out.println("Invalid Number ");
		}
		return correct;	
		
		
	}
	public boolean passwordCase1(String password) {    //create 8 digit password
	
		boolean  correct = Pattern.matches("[A-Za-z]{8}", password);
		if(correct) {
			System.out.println("password  inserted successfully");
			
		}else {
			System.out.println("Invalid password ");
		}
		return correct;	
		
		
	}
	public boolean passwordCase2(String password) {     //Atleast one uppercase
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{7}", password);
		if(correct) {
			System.out.println("password  inserted successfully");
			
		}else {
			System.out.println("Invalid password ");
		}
		return correct;	
		
		
	}
	public boolean passwordCase3(String password){     // with one numeric
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{6}[0-9]+", password);
		if(correct) {
			System.out.println("password  inserted successfully");
			
		}else {
			System.out.println("Invalid password ");
		}
		return correct;	
		
		
	}
	
	public boolean passwordCase4(String password) {     // with one special character
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{6}[0-9]+[@#]{1}", password);
		if(correct) {
			System.out.println("password  inserted successfully");
			
		}else {
			System.out.println("Invalid password ");
		}
		return correct;	
		
		
	}
	public boolean emailCheck(String email) {     //emailValidation
		
		boolean  correct = Pattern.matches("\"^([a-zA-Z0-9]+[._+-]{1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$\";", email);
		if(correct) {
			System.out.println("Email inserted successfully");
			
		}else {
			System.out.println("Invalid email ");
		}
		return correct;	
		
		
	}
	
}


