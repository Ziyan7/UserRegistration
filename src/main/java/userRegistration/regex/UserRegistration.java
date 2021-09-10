package userRegistration.regex;

import java.util.regex.Pattern;

import userRegistration.regex.RegistrationException.ExceptionType;

public class UserRegistration {
	// method to validate the first name
	
	public boolean validateFirstName(String firstName) throws RegistrationException {	
			String pattern = "^[A-Z][a-zA-Z]{2,}";
			if (Pattern.matches(pattern, firstName))
				return true;
			else
				throw new RegistrationException(RegistrationException.ExceptionType.FirstName_NoCaps,"First letter should be capital");
	}

	// method to validate the Last name
	public boolean validateLastName(String lastName) throws RegistrationException{
		String pattern = "^[A-Z][a-zA-Z]{2,}";
		if (Pattern.matches(pattern, lastName))
			return true;
		else
			throw new RegistrationException(RegistrationException.ExceptionType.LastName_NoCaps,"First letter should be capital");
	}

	// method to validate the emailId
	public boolean validateEmailId(String emailId)  throws RegistrationException {
		String pattern ="^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
		if (Pattern.matches(pattern, emailId))
			return true;
		else 
			throw new RegistrationException(RegistrationException.ExceptionType.Invalid_Email,"Enter valid email");
	}

	// method to validate the mobile number
	public boolean validateMobileNo(String mobileNo) throws RegistrationException {
		String pattern = "^[0-9 ]+[ ][0-9]{10}";
		if (Pattern.matches(pattern, mobileNo))
			return true;
		else
			throw new RegistrationException(RegistrationException.ExceptionType.InvalidNumber,"Enter valid Number");
			
	}

	// method to check password
	public boolean validatePassword(String password) throws RegistrationException {
			String pattern ="^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
			if (Pattern.matches(pattern, password))
				return true;
			else
				throw new RegistrationException(RegistrationException.ExceptionType.Invalid_Password,"Enter valid password");
		}
	
}
