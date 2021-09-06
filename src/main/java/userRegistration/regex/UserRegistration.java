package userRegistration.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	//method to validate the first name

    public boolean validateFirstName(String firstName)
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        return Pattern.matches(pattern, firstName);
    }
    
}
