package travelpack;

import java.util.ArrayList;

public class PacketList {
	
	
	public static ArrayList<Packet> createPacketList(UserOptions uo) {
		
		ArrayList<Hotel> hotels;

		hotels=HotelList.createHotelList(uo);
		
		ArrayList<Packet> packetList = new ArrayList<>();
		
		Flight flight = new Flight(uo.getDepCity(),uo.getDestination(),uo.getFlightType(),uo.isBaggage(),uo.getDate());

		for (Hotel hotel :hotels) {
			if(uo.getDestination().trim().toUpperCase().equals(hotel.getCity().toUpperCase())&&hotel.isAvailable(uo)) {
				Packet p = new Packet(hotel, flight);
				packetList.add(p);
			}
		}
		return packetList;
	}

}
