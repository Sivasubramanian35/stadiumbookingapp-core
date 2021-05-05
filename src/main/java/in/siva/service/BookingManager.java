package in.siva.service;

import java.util.HashMap;
import java.util.Set;

import in.siva.validator.SeatNoValidator;
import in.siva.validator.StringValidator;

public class BookingManager {

	static HashMap<String, Integer> bookingList = new HashMap<String, Integer>();
	static {
		bookingList.put("mani", 10);
		bookingList.put("sankar", 20);
	}

	/**
	 * This method is used to book the seat
	 * 
	 * @param name
	 * @param seatNo
	 */

	public static void bookSeat(String name, int seatNo) {
		// Validate the name and seat number before book seat.
		boolean validName = StringValidator.isValidString(name);
		boolean validSeatNo = SeatNoValidator.isValidSeatNo(seatNo);
		if (validName && validSeatNo) {
			bookingList.put(name, seatNo);// put the name and seat number to hash map
			System.out.println("Successfully booked");
		} else {
			System.out.println("Invalid");
		}
	}

	/**
	 * This method is used to get the status of seats availability.
	 */
	public static void bookingStatus() {
		int noOfSeats = 30;
		int noOfBookedSeats = bookingList.size();

		System.out.println("---------Booking Status---------");
		System.out.println("Number of booked seats------" + noOfBookedSeats);
		System.out.println("Number of Available seats---" + (noOfSeats - noOfBookedSeats));
	}

	/**
	 * This method is used to cancel the seat.
	 */
	public static void cancelSeat(String name, int seatNo) {
		// Check name and seat no is already booked.
		if (bookingList.containsKey(name) && bookingList.containsValue(seatNo)) {
			bookingList.remove(name, seatNo);
			System.out.println("Cancelled");
		} else {
			System.out.println("Entered name or seat number invalid");
		}
	}

	/**
	 * This method is used to get all booked users.
	 */
	public static void getAllBookedUser() {
		Set<String> nameList = bookingList.keySet();
		for (String names : nameList) {
			int seatNumber = bookingList.get(names);
			System.out.println("Name -" + names + " Seat number -" + seatNumber);

		}
	}

}
