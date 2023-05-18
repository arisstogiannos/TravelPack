package travelpack;

public class UserOptions {
	private String destination;
	private String depCity;
	private String pplNum;
	private String roomType;
	private String flightType;
	private boolean baggage;
	private int[] departureTime;
	private int days;
	private int[] date;
	public int[] getDate() {
		return date;
	}
	public void setDate(int[] date) {
		this.date = date;
	}
	private String month;
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
	public String getPplNum() {
		return pplNum;
	}
	public void setPplNum(String pplNum) {
		this.pplNum = pplNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public boolean isBaggage() {
		return baggage;
	}
	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}
	public int[] getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int[] departureTime) {
		this.departureTime = departureTime;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}		

	
	
}
