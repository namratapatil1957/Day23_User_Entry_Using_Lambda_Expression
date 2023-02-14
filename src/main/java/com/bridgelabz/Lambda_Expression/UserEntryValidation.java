package com.bridgelabz.Lambda_Expression;

import java.util.*;
import java.util.function.*;

public class UserEntryValidation {
	
	// pattern for first name
	void fName() {
		
		Predicate <String> predicate = fname -> fname.matches("^[A-Z][a-z]{2,}");
		System.out.println(predicate.test("Namrata"));
		
	}
	
	//pattern for last name
	void lName() {
		
		Predicate <String> predicate = lname -> lname.matches("^[A-Z][a-z]{2,}");
		System.out.println(predicate.test("Patil"));
		
	}
	
	// pattern for email
	void email() {
		
		Predicate <String> predicate = email -> email.matches("^abc[.][a-z]*[@]bl[.]co[.][a-z]*");
		System.out.println(predicate.test("abc.xyz@bl.co.com"));
		
	}
	
	// pattern for mobile
	void mobile() {
		
		Predicate <String> predicate = mobile -> mobile.matches("^(91-)[6-9][0-9]{9}");
		System.out.println(predicate.test("91-8399253515"));
		
	}
	
	// pattern for password
	
	void password() {
		
		Predicate <String> predicate = mobile -> mobile.matches("[[a-zA-z0-9]]{8,}");
		System.out.println(predicate.test("namrata24"));
		
	}
	
	//pattern for upper case password
	void upperCase() {
		
		Predicate <String> predicate = mobile -> mobile.matches("[[a-z][0-9][A-Z]+]{8,}");
		System.out.println(predicate.test("namratA24"));
		
	}
	
	//pattern for numeric number password
	void numericNumber() {
		
		Predicate <String> predicate = mobile -> mobile.matches("[[a-z]([0-9]+)([A-Z]+)]{8,}");
		System.out.println(predicate.test("Namrata24patil"));
		
	}
	
	//pattern for special character
	void specialCharacter() {
		
		Predicate <String> predicate = mobile -> mobile.matches("[[a-z]([0-9]+)([A-Z]+)([!#*@$&]+)]{8,}");
		System.out.println(predicate.test("Namrata@24patil"));
		
	}
	
	public static void main(String[] args) {
		
		UserEntryValidation user = new UserEntryValidation();
		
		user.fName();
		user.lName();
		user.email();
		user.password();
		user.upperCase();
		user.numericNumber();
		user.specialCharacter();
		
	}
	
}
