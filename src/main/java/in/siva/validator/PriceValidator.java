package in.siva.validator;

public class PriceValidator {

	public static boolean isValidPrice(int price) {
		boolean validPrice = false;
		if (price > 0) {
			validPrice = true;
		}
		return validPrice;
	}
}
