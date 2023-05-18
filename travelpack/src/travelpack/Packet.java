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
	public int calculateTotalPrice() {
		return  hotel.getPrice() + flight.getPrice();		
	}
}
