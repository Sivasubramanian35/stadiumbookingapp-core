package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.BookingManager;

public class BookingStatusTest {

	/**
	 * Test for know the status for seats availability.
	 */
	@Test
	public void test() {
		BookingManager.bookingStatus();
	}

}
