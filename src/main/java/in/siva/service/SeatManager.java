package in.siva.service;

import java.time.LocalDate;

import java.util.HashMap;

public class SeatManager {

	static HashMap<LocalDate, Integer> noOfBookedSeats = new HashMap<LocalDate, Integer>();
	static {
		noOfBookedSeats.put(LocalDate.parse("2021-05-03"), 20);
		noOfBookedSeats.put(LocalDate.parse("2021-05-04"), 4);
	}

	/**
	 * This method is used to allocate seats.
	 * 
	 * @param date
	 * @param noOfSeats
	 */
	public static void allocateSeats(LocalDate date, int noOfSeats) {
		int seats = noOfBookedSeats.get(date) != null ? noOfBookedSeats.get(date) : 0;
		seats = seats + noOfSeats;
		noOfBookedSeats.put(date, seats);
	}

	/**
	 * This method returns number of available seats
	 * 
	 * @param date
	 * @return
	 */
	public static int checkAvailability(LocalDate date) {

		int totalseats = 30;
		int availableSeats;
		Integer bookedSeats = noOfBookedSeats.get(date) != null ? noOfBookedSeats.get(date) : 0;
		availableSeats = totalseats - bookedSeats;
		return availableSeats;

	}

}
