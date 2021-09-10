package userRegistration.regex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class UserRegistrationTest {
	String firstName;
	String lastName;
	String emailId;
	String mobileNo;
	String password;
	Boolean expected;
	UserRegistration obj;

	@Before
	public void initialize() {
		obj = new UserRegistration();
	}

	public UserRegistrationTest(String emailId, Boolean expected) {
		this.firstName = "abdul";
		this.lastName = "ziyan";
		this.emailId = emailId;
		this.mobileNo = "9900337455";
		this.password = "ab";
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection Users() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false }

		});
	}

	@Test
	public void detailChecker() {
		UserRegistration obj = new UserRegistration();
		//exception handling for first name capital letter
		try {
			assertEquals(true, obj.validateFirstName(firstName));
		}
		catch(RegistrationException e) {
			assertEquals(RegistrationException.ExceptionType.FirstName_NoCaps,e.type);
		}
		//exception handling for first name capital letter
		try {
			assertEquals(true, obj.validateLastName(lastName));
		}
		catch(RegistrationException e) {
			assertEquals(RegistrationException.ExceptionType.LastName_NoCaps,e.type);
		}
		
		//exception handling of invalid email
		try {
		assertEquals(true, obj.validateEmailId(emailId));
		}
		catch(RegistrationException e) {
			assertEquals(RegistrationException.ExceptionType.Invalid_Email,e.type);
		}
		//exception handling of invalid mobile number
		try {
			assertEquals(true, obj.validateMobileNo(mobileNo));
		}
		catch(RegistrationException e) {
			assertEquals(RegistrationException.ExceptionType.InvalidNumber,e.type);
		}
		
		//exception handling of invalid mobile number
		try {
			assertEquals(true, obj.validatePassword(password));
		}
		catch(RegistrationException e) {
			assertEquals(RegistrationException.ExceptionType.Invalid_Password,e.type);
		}

	}

}
