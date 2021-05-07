package in.siva.servicetest;

import org.junit.Test;

import in.siva.service.PaymentManager;

public class PaymentManagerTest {

	/**
	 * Test for Invalid price
	 */
	@Test
	public void testWithInvalidPrice() {
		int price = -1000;
		PaymentManager.gst(price);

	}

	/**
	 * Test for valid price
	 */
	@Test
	public void testWithValidPrice() {
		int price = 1500;
		PaymentManager.gst(price);

	}

}
