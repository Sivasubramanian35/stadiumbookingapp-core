package in.siva.validator;

public class StringValidator {
	public static boolean isValidString(String input) {
		boolean isValid = true;
		if ( input == null || input.trim().equals("")) {
			isValid = false;
		}
		return isValid;
	}
}

