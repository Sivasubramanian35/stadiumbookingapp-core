package in.siva.validatortest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.validator.StringValidator;

public class UserNameValidatorTest {

	/**
	 * Test with invalid name.
	 */
	@Test
	public void testWithInvalidName() {
		String userName = "";
		boolean valid = StringValidator.isValidString(userName);
		assertFalse(valid);
	}

	/**
	 * Test with valid name.
	 */
	@Test
	public void testWithValidName() {
		String userName = "siva";
		boolean valid = StringValidator.isValidString(userName);
		assertTrue(valid);
	}

}
