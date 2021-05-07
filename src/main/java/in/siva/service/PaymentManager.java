package in.siva.service;

import in.siva.validator.PriceValidator;

public class PaymentManager {
	/**
	 * This method is used to find the gst of price
	 * 
	 * @param price
	 */
	public static void gst(int price) {
		int gstPercentage = 18;
		if (PriceValidator.isValidPrice(price)) {
			float gst = (gstPercentage * price) / 100;// Calculate gst
			System.out.println("GST Percentage: " + gstPercentage + "%");
			System.out.println("GST Value for " + price + " : " + gst);
		} else {
			System.out.println("Enter valid price");
		}
	}

}
