package in.siva.validator;

public class SeatNoValidator {

	public static boolean isValidSeatNo(int seatNo) {
		boolean validSeatNo = false;
		if (seatNo > 0 && seatNo < 30) {
			validSeatNo = true;
		}
		return validSeatNo;
	}
}
