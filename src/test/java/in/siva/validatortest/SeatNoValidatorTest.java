package in.siva.validatortest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.validator.SeatNoValidator;

public class SeatNoValidatorTest {

	/**
	 * Test with invalid seat number.
	 */
	@Test
	public void testWithInvalidseatNo() {
		int seatNo = -1;
		boolean valid = SeatNoValidator.isValidSeatNo(seatNo);
		assertFalse(valid);
	}

	/**
	 * Test with invalid seat Number.
	 */
	@Test
	public void testWithValidSeatNo() {
		int seatNo = 5;
		boolean valid = SeatNoValidator.isValidSeatNo(seatNo);
		assertTrue(valid);
	}

}
