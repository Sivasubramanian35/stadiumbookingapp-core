package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.BookingManager;

public class SeatCancellingTest {

	/**
	 * Test with registered data.
	 */
	@Test
	public void testWithRegisteredData() {
		String name = "mani";
		int seatNo = 10;
		BookingManager.cancelSeat(name, seatNo);
	}

	/**
	 * Test with not registered data.
	 */
	@Test
	public void testWithNotRegisterdData() {
		String name = "vel";
		int seatNo = 11;
		BookingManager.cancelSeat(name, seatNo);
	}

}
