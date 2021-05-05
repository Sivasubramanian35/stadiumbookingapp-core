package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.SeatManager;

public class SeatPriceTest {

	/**
	 * Test with Invalid seat number.
	 */
	@Test
	public void testWithInvalidSeatNo() {
		int seatNo = -9;
		SeatManager.getPrice(seatNo);
	}

	/**
	 * Test wit valid seat number.
	 */
	@Test
	public void testWithSeatNo() {
		int seatNo = 15;
		SeatManager.getPrice(seatNo);
	}

}
