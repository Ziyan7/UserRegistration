package userRegistration.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	// method to validate the first name

	public boolean validateFirstName(String firstName) {
		String pattern = "^[A-Z][a-zA-Z]{2,}";
		return Pattern.matches(pattern, firstName);
	}

	// method to validate the Last name

	public boolean validateLastName(String lastName) {
		String pattern = "^[A-Z][a-zA-Z]{2,}";
		return Pattern.matches(pattern, lastName);
	}

	// method to validate the emailId

	//public boolean validateEmailId(String emailId) {
		//String pattern = "^[a-zA-Z0-9-_]+[.]?[a-zA-Z0-9-_]*@[a-zA-Z0-9-_]+[.][a-z]{2,3}[.]?[a-zA-Z-_]*";
		//return Pattern.matches(pattern, emailId);
	//}

	// method to validate the mobile number
	public boolean validateMobileNo(String mobileNo) {
		String pattern = "^[0-9 ]+[ ][0-9]{10}";
		return Pattern.matches(pattern, mobileNo);
	}

	public boolean validatePassword(String password) {
		if(password.length()>7) {
			return true;
		}else {
			return false;
		}
	}
}
