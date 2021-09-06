package userRegistration.regex;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class UserRegistrationTest {
	@Test
	// method for validation
	public void firstNameChecker() {
		System.out.println("Enter your First Name");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();

		System.out.println("Enter your Last Name");
		String lastName = sc.nextLine();

		System.out.println("Enter your emailId");
		String emailId = sc.nextLine();
		sc.close();

		System.out.println("Enter your mobileNo");
		String mobileNo = sc.nextLine();

		System.out.println("Enter password:");
		String password = sc.nextLine();
		sc.close();
		UserRegistration obj = new UserRegistration();
		assertTrue(obj.validateFirstName(firstName));
		assertTrue(obj.validateLastName(lastName));
		assertTrue(obj.validateEmailId(emailId));
		assertTrue(obj.validateMobileNo(mobileNo));
		assertTrue(obj.validatePassword(password));
	}

}
