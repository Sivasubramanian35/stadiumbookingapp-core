package in.siva.servicetest;

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
		BookingManager.bookSeat(name, seatNo);

	}

	/**
	 * Test With valid name
	 */
	@Test
	public void testWithValidName() {
		String name = "siva";
		int seatNo = 10;
		BookingManager.bookSeat(name, seatNo);

	}

}
