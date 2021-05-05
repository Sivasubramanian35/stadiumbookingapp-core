package in.siva.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.service.UserManager;

public class UserLoginTest {

	/**
	 * Test with registered record.
	 */
	@Test
	public void testWithRegisteredRecord() {
		String userName = "sankar";
		String password = "sankar123";
		boolean loginStatus = UserManager.login(userName, password);
		assertTrue(loginStatus);
	}

	/**
	 * Test with not registered record.
	 */
	@Test
	public void testWithNotRegisteredRecord() {
		String userName = "mani";
		String password = "mani123";
		boolean loginStatus = UserManager.login(userName, password);
		assertFalse(loginStatus);
	}

}
