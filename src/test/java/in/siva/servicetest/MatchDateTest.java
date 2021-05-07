package in.siva.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.service.AdminManager;

public class MatchDateTest {

	/**
	 * Test with not available match
	 */
	@Test
	public void testWithInvaildMatchName() {
		String team1 = "";
		String team2 = "kkr";
		String date = AdminManager.getMatchDate(team1, team2);
		assertEquals(date, "Not Available");

	}

	/**
	 * Test with available match
	 */
	@Test
	public void testWithAvailableMatch() {
		String team1 = "csk";
		String team2 = "mi";
		String date = AdminManager.getMatchDate(team1, team2);
		assertEquals(date, "2021-05-03");
	}

	/**
	 * Test with not available match
	 */
	@Test
	public void testWithNotAvailableMatch() {
		String team1 = "rcb";
		String team2 = "kkr";
		String date = AdminManager.getMatchDate(team1, team2);
		assertEquals(date, "Not Available");
	}

}
