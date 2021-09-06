package userRegistration.regex;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class UserRegistrationTest {
	@Test
	// testing method for valid input name
	public void firstNameChecker() {
		System.out.println("Enter your First Name");
		Scanner sc = new Scanner(System.in);
		String firstname = sc.nextLine();

		System.out.println("Enter your Last Name");
		String lastname = sc.nextLine();
		sc.close();
		UserRegistration obj = new UserRegistration();
		assertTrue(obj.validateFirstName(firstname));
		assertTrue(obj.validateLastName(lastname));
	}

}
