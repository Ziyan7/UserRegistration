package userRegistration.regex;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	static Scanner sc = new Scanner(System.in);

	// validate first name using Predicate Functional Interface
	public static void validateFirstName() {
		// compile regex as predicate
		Predicate<String> firstNameFilter = Pattern.compile("^[A-Z][a-zA-Z]{2,}").asPredicate();
		System.out.println("Enter first name");
		String firstName = sc.nextLine(); // input firstname
		System.out.println(firstNameFilter.test(firstName));
	}

	// validate last name using Predicate Functional Interface
	public static void validateLastName() {
		Predicate<String> lastNameFilter = Pattern.compile("^[A-Z][a-zA-Z]{2,}").asPredicate();
		System.out.println("Enter last name");
		String lastName = sc.nextLine();
		System.out.println(lastNameFilter.test(lastName));
	}

	// validate email using Predicate Functional Interface
	public static void validateEamilId() {
		Predicate<String> emailIdFilter = Pattern
				.compile("^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)")
				.asPredicate();
		System.out.println("Enter email id");
		String emailId = sc.nextLine();
		System.out.println(emailIdFilter.test(emailId));
	}
	
	public static void validateMobileNo() {
		Predicate<String> mobileNoFilter = Pattern.compile("^[0-9 ]+[ ][0-9]{10}").asPredicate();
		System.out.println("Enter mobile number");
		String mobileNo = sc.nextLine();
		System.out.println(mobileNoFilter.test(mobileNo));
	}
	
	public static void validatePassword() {
		Predicate<String> passwordFilter = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$").asPredicate();
		System.out.println("Enter password");
		String password = sc.nextLine();
		System.out.println(passwordFilter.test(password));
	}
	

	public static void main(String[] args) {
		validateFirstName();
		validateLastName();
		validateEamilId();
		validateMobileNo();
		validatePassword();
	}
}
