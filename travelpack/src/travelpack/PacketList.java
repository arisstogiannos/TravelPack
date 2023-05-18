package travelpack;

import java.util.ArrayList;

public class PacketList {
	ArrayList<Packet> packetList = new ArrayList<>();
	ArrayList<Hotel> hotels;
	UserOptions US;
	
	
	public void createPacketList() {
		hotels = HotelList.getHotels();
		for (Hotel hotel :hotels) {
			if(US.getDestination().equals(hotel.getCity())) {
				Flight flight = new Flight(US.getDepCity(),US.getDestination(),US.getFlightType(),US.isBaggage(),US.getDate());
				Packet p = new Packet(hotel, flight);
				packetList.add(p);
			}
		}
		
	}

}
