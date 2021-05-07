package in.siva.servicetest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import in.siva.service.BookingManager;

public class SeatBookingTest {

	/**
	 * Test With invalid data
	 */
	@Test
	public void testWithInvalidData() {
		int noOfSeats = 40;
		LocalDate date = LocalDate.parse("2021-05-03");
		boolean booking = BookingManager.bookSeat(noOfSeats, date);
		assertFalse(booking);

	}

	/**
	 * Test With valid data
	 */
	@Test
	public void testWithValidData() {
		int noOfSeats = 5;
		LocalDate date = LocalDate.parse("2021-05-03");
		boolean booking = BookingManager.bookSeat(noOfSeats, date);
		assertTrue(booking);
	}

}
