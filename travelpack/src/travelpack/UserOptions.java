package travelpack;

/*
Η κλάση UserOptions διατηρεί τα στοιχεία που εισάγει ο χρήστης 
*/

public class UserOptions {
	private String destination = "";
	private String depCity = "";
	private int pplNum;
	private Object roomType;
	private Object flightType;
	private boolean baggage = false;
	private int days;
	private int[] time;
	private String date;
	private String roomCapacity;

	public int getCapacityAsInt() {
		if (roomCapacity.contains("Single")) {
			return 1;
		} else if (roomCapacity.contains("Double")) {
			return 2;
		} else if (roomCapacity.contains("Triple")) {
			return 3;
		} else {
			return 4;
		}
	}

	public String getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(String roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public int[] getTime() {
		return time;
	}

	public void setTime(int[] time) {
		this.time = time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public int getPplNum() {
		return pplNum;
	}

	public void setPplNum(int pplNum) {
		this.pplNum = pplNum;
	}

	public Object getRoomType() {
		return roomType;
	}

	public void setRoomType(Object roomType) {
		this.roomType = roomType;
	}

	public Object getFlightType() {
		return flightType;
	}

	public void setFlightType(Object flightType) {
		this.flightType = flightType;
	}

	public boolean isBaggage() {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getDateAsString() {
		return date;
	}

	public int[] getDate() {
		int[] dates = { 1, 1, 1 };
		String[] strArr = date.split("/", 3);
		for (int i = 0; i < strArr.length; i++) {
			dates[i] = Integer.parseInt(strArr[i]);
		}
		return dates;
	}

	public void setDate(String month) {
		this.date = month;
	}

}
