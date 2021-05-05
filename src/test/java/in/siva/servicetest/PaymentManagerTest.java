package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.PaymentManager;

public class PaymentManagerTest {

	/**
	 * Test for Gst
	 */
	@Test
	public void testGst() {
		int price = 1500;
		PaymentManager.gst(price);

	}

	/**
	 * Test for total payment
	 */
	@Test
	public void testTotal() {
		int price = 1500;
		float gst = 270;
		PaymentManager.totalPayment(price, gst);

	}

}
