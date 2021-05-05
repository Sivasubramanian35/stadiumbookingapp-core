package in.siva.validatortest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.validator.PasswordValidator;

public class PasswordValidatorTest {

	/**
	 * Test with invalid password.
	 */
	@Test
	public void testWithInvalidPassword() {
		String password = "";
		boolean valid = PasswordValidator.isValidPassword(password);
		assertFalse(valid);
	}

	/**
	 * Test with valid name.
	 */

	@Test
	public void testWithvalidPassword() {
		String password = "siva@1234567";
		boolean valid = PasswordValidator.isValidPassword(password);
		assertTrue(valid);
	}

}
