package in.siva.validator;

public class PasswordValidator {

	public static boolean isValidPassword(String password) {
		boolean isValid = true;
		if (password == null || password.trim().equals("") || password.length() < 8) {
			isValid = false;
		}
		return isValid;
	}
}
