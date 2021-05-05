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

	/**
	 * This method is used to calculate the total amount
	 * 
	 * @param price
	 * @param gst
	 */
	public static void totalPayment(int price, float gst) {
		float totalAmount = price + gst;// Calculate total amount
		System.out.println("Total Amount : Rs." + totalAmount);
	}

}
