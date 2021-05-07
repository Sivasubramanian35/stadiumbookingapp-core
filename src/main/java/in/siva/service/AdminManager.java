package in.siva.service;

import java.util.HashSet;

import in.siva.model.Matches;

import in.siva.validator.TeamNameValidator;

import java.time.LocalDate;

public class AdminManager {

	// Create the hash set
	private static HashSet<Matches> matchesWithDate = new HashSet<Matches>();
	static {
		Matches match1 = new Matches();
		match1.team1 = "csk";
		match1.team2 = "mi";
		match1.matchDate = LocalDate.parse("2021-05-03");
		matchesWithDate.add(match1);
		Matches match2 = new Matches();
		match2.team1 = "srh";
		match2.team2 = "mi";
		match2.matchDate = LocalDate.parse("2021-05-04");
		matchesWithDate.add(match2);

	}

	/**
	 * This method returns the date of match
	 * 
	 * @param match
	 * @return
	 */
	public static String getMatchDate(String team1, String team2) {
		String matchDate = "Not Available";
		// Iterate the set matchWithDate
		if (TeamNameValidator.isValidTeamName(team1) && TeamNameValidator.isValidTeamName(team2)) {
			for (Matches matchDetails : matchesWithDate) {
				if (matchDetails.team1.equalsIgnoreCase(team1) && matchDetails.team2.equalsIgnoreCase(team2)) {
					matchDate = matchDetails.matchDate.toString();
					System.out.println("Match date - " + matchDate);
					break;
				}
			}
		} else {
			System.out.println("Enter valid team names");
		}
		return matchDate;
	}

}
