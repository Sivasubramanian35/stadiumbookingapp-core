package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.BookingManager;

public class displayBookedUserTest {

	/**
	 * Test for display all booked users.
	 */
	@Test
	public void test() {
		BookingManager.getAllBookedUser();
	}

}
