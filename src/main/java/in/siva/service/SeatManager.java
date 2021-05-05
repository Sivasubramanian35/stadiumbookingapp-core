package in.siva.service;

import java.util.HashMap;
import java.util.Set;

import in.siva.validator.SeatNoValidator;

public class SeatManager {

	static HashMap<String, Integer> bookingList = new HashMap<String, Integer>();
	static {
		bookingList.put("sankar", 22);
		bookingList.put("mani", 10);
	}

	/**
	 * This method used to get the price of seat number
	 * 
	 * @param seatNo
	 * @return
	 */
	public static void getPrice(int seatNo) {
		int price = 0;
		boolean valid = true;
		if (1 <= seatNo && seatNo <= 10) {
			price = 500;
		} else if (11 <= seatNo && seatNo <= 20) {
			price = 1000;
		} else if (21 <= seatNo && seatNo <= 30) {
			price = 1500;
		} else {
			System.out.println("Invalid seat number");
			valid = false;
		}
		if (valid) {
			System.out.println("Price for seat number " + seatNo + "---->Rs." + price);
		}
	}

	/**
	 * This method returns true if seats are available otherwise returns false
	 * 
	 * @param seatNo
	 * @return
	 */
	public static boolean checkAvailability(int seatNo) {

		boolean available = true;
		Set<String> nameList = bookingList.keySet();
		if (SeatNoValidator.isValidSeatNo(seatNo)) {
			for (String names : nameList) {
				int seatNumber = bookingList.get(names);
				if (seatNo == seatNumber) {
					System.out.println("Not Available");
					available = false;
					break;
				}
			}
		} else {
			System.out.println("Invalid seatNo");
			available = false;
		}
		if (available) {
			System.out.println("Available");
		}
		return available;
	}

}
