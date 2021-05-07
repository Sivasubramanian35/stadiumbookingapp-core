package in.siva.validator;

import java.time.LocalDate;

import in.siva.service.SeatManager;

public class SeatsValidator {

	public static boolean isValidSeats(int noOfSeats, LocalDate bookingDate) {
		boolean validSeats = false;
		int availability = SeatManager.checkAvailability(bookingDate);
		if (noOfSeats > 0 && noOfSeats < availability) {
			validSeats = true;
		}
		return validSeats;
	}
}
