package in.siva.service;

import java.time.LocalDate;

import in.siva.validator.SeatsValidator;

public class BookingManager {

	/**
	 * This method is used to book the seat
	 * 
	 * @param name
	 * @param seatNo
	 */

	public static boolean bookSeat(int noOfSeats, LocalDate bookingDate) {
		// Validate the name and seat number before book seat.
		boolean booked = false;
		if (SeatsValidator.isValidSeats(noOfSeats, bookingDate)) {
			SeatManager.allocateSeats(bookingDate, noOfSeats);
			booked = true;
		} else {
			booked = false;
		}
		return booked;
	}

}
