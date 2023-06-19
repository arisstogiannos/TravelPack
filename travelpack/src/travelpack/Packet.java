package travelpack;

public class Packet {
	private Hotel hotel;
	private Flight flight;
	private int totalprice;

	public Packet(Hotel hotel, Flight flight) {

		this.hotel = hotel;
		this.flight = flight;
		this.totalprice = calculateTotalPrice();

	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getTotalprice() {
		return Integer.toString(totalprice);
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public int calculateTotalPrice() {
		return hotel.getPrice() + flight.getPrice();
	}
}
