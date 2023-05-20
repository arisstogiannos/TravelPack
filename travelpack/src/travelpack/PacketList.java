package travelpack;

import java.util.ArrayList;

public class PacketList {
	static ArrayList<Packet> packetList = new ArrayList<>();
	static ArrayList<Hotel> hotels;
	
	
	
	public static void createPacketList(UserOptions uo) {
		HotelList.createHotelList(uo);
		hotels = HotelList.getHotels();
		for (Hotel hotel :hotels) {
			if(uo.getDestination().equals(hotel.getCity())) {
				Flight flight = new Flight(uo.getDepCity(),uo.getDestination(),uo.getFlightType(),uo.isBaggage(),uo.getDate());
				Packet p = new Packet(hotel, flight);
				packetList.add(p);
			}
		}
		
	}

}
