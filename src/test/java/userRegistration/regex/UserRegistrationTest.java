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
		this.firstName = "Abdul";
		this.lastName = "Ziyan";
		this.emailId = emailId;
		this.mobileNo = "91 9900337455";
		this.password = "abcdH@123";
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
		assertEquals(true, obj.validateFirstName(firstName));
		assertEquals(true, obj.validateLastName(lastName));
		assertEquals(expected, obj.validateEmailId(emailId));
		assertEquals(true, obj.validateMobileNo(mobileNo));
		assertEquals(true, obj.validatePassword(password));

	}

}
