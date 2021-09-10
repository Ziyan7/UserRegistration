package userRegistration.regex;

public class RegistrationException extends Exception{ 
public ExceptionType type;
	
	public enum ExceptionType {
        FirstName_NoCaps,
        LastName_NoCaps,
        Invalid_Email,
        InvalidNumber,
        Invalid_Password
    }
	
		public RegistrationException(ExceptionType type, String message) {
			super(message);
			this.type=type;
		}
}
