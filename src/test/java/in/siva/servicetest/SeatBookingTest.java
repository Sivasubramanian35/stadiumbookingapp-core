package in.siva.servicetest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.siva.service.BookingManager;

public class SeatBookingTest {

	/**
	 * Test With invalid name
	 */
	@Test
	public void testWithInvalidName() {
		String name = " ";
		int seatNo = -12;
		boolean booking = BookingManager.bookSeat(name, seatNo);
		assertFalse(booking);

	}

	/**
	 * Test With valid name
	 */
	@Test
	public void testWithValidName() {
		String name = "siva";
		int seatNo = 10;
		boolean booking = BookingManager.bookSeat(name, seatNo);
		assertTrue(booking);
	}

}
