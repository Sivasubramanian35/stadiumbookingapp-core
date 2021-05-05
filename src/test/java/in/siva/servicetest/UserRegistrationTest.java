package in.siva.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.service.UserManager;

public class UserRegistrationTest {

	/**
	 * Test with InValid name and valid Password
	 */
	@Test
	public void testWithInValidNameAndValidPassword() {
		String userName = " ";
		String password = "siva12345";
		boolean registrationStatus = UserManager.registration(userName, password);
		assertFalse(registrationStatus);
	}

	/**
	 * Test with Valid Name And Invalid Password
	 */
	@Test
	public void testWithValidNameAndInValidPassword() {
		String userName = "siva";
		String password = " ";
		boolean registrationStatus = UserManager.registration(userName, password);
		assertFalse(registrationStatus);
	}

	/**
	 * Test with Both InValid Name and Password
	 */
	@Test
	public void testWithBothInValidNameAndPassword() {
		String userName = " ";
		String password = "siva1";
		boolean registrationStatus = UserManager.registration(userName, password);
		assertFalse(registrationStatus);
	}

	/**
	 * Test with Both Valid Name and Password
	 */
	@Test
	public void testWithBothValidNameAndPassword() {
		String userName = "siva";
		String password = "siva123456";
		boolean registrationStatus = UserManager.registration(userName, password);
		assertTrue(registrationStatus);
	}

}
