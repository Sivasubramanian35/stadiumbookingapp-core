package in.siva.validator;

public class TeamNameValidator {
	
	public static boolean isValidTeamName(String input) {
		boolean isValid = true;
		if (input == null || input.trim().equals("")|| input.length()<2) {
			isValid = false;
		}
		return isValid;
	}

}
