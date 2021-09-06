package userRegistration.regex;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;



public class UserRegistrationTest {
	@Test
	//testing method for valid input name
	public void test() {
		System.out.println("Enter your Name");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		sc.close();
		UserRegistration obj = new UserRegistration();
		assertTrue(obj.validateFirstName(name));
	}
	
}
