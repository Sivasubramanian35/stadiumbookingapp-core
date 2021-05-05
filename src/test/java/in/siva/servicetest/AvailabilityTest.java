package in.siva.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import in.siva.service.SeatManager;

public class AvailabilityTest {

	/**
	 * Test with available seat no
	 */

	@Test
	public void testWithAvailableSeat() {
		int seatNo = 11;
		boolean available = SeatManager.checkAvailability(seatNo);
		assertTrue(available);
	}

	/**
	 * Test with invalid seat no
	 */
	@Test
	public void testWithInvaliSeatNo() {
		int seatNo = -2;
		boolean available = SeatManager.checkAvailability(seatNo);
		assertFalse(available);
	}

	/**
	 * Test with not available seat no
	 */
	@Test
	public void testWithNotAvailableSeat() {
		int seatNo = 22;
		boolean available = SeatManager.checkAvailability(seatNo);
		assertFalse(available);
	}

}
