package in.siva.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.service.UserManager;

public class UserLoginTest {

	/**
	 * Test with valid registered record.
	 */
	@Test
	public void testWithValidRegisteredRecord() {
		String userName = "sankar";
		String password = "sankar123";
		boolean loginStatus = UserManager.login(userName, password);
		assertTrue(loginStatus);
	}

	/**
	 * Test with invalid record.
	 */
	@Test
	public void testWithInvalidData() {
		String userName = "";
		String password = "mani12345";
		boolean loginStatus = UserManager.login(userName, password);
		assertFalse(loginStatus);
	}

	/**
	 * Test with not registered record.
	 */
	@Test
	public void testWithNotRegisteredRecord() {
		String userName = "mani";
		String password = "mani12345";
		boolean loginStatus = UserManager.login(userName, password);
		assertFalse(loginStatus);
	}

}
