package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
	private String name;
	private String city;
	private int price;
	private int code;
	ArrayList<Room> rooms;
	private Room availableRoom;
	ArrayList<Booking> bookings; 
	
	
	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}


	public int getPrice() {
		return price;
	}


	public int getCode() {
		return code;
	}


	public ArrayList<Room> getRooms() {
		return rooms;
	}


	public Hotel(String name, String city, int price, int code) {
		this.name = name;
		this.city = city;
		this.price = price;
		this.code = code;
		bookings=Booking.createBookings();
		rooms = createRoomList();
		
	}
	
	
	 public ArrayList<Room> createRoomList() {
		 ArrayList<Room> rooms = new ArrayList<>();
		String[] type = {"Simple","Suite"};
		int[] capacity= {1,2,3,4};
		boolean[][] available;
		
		for (int j = 0; j < type.length; j++) {
			for (int i = 0; i < capacity.length; i++) {
				for (int k = 0; k < 3; k++) {
					Room r = new Room(type[j], capacity[i], (j+1)*100 + (i+1)*10 +k);
					
					for(Booking booking:bookings) {
						if(booking.getHotelName().equals(this.name)&& booking.getCode()==r.getCode()) {
							
							available=r.getAvailable();
							for(int z=booking.getDay()-1;z<=booking.getDay()-1+booking.getDays();z++) {
								if(z-31>=0)
									available[booking.getMonth()%12][z%31]=false;
								else 
									available[booking.getMonth()-1][z]=false; 
							}
							r.setAvailable(available);
						}
					}
					rooms.add(r);
				}
			}
		}
		
		return rooms;
		
		
	}
	 
	 public Room availableRoom(UserOptions uo) {
		 boolean booked=false;
		 boolean[][] available;
		 int date[]=uo.getDate();
		 for(Room room:rooms) {
			 if(uo.getRoomType().equals(room.getType())&&room.getCapacity()==uo.getCapacityAsInt()) {
				 available = room.getAvailable();
				 for(int i=date[0]-1;i<date[0]+uo.getDays()-1;i++) {
					 
						 if(i-31>=0){
							 if(!available[date[1]%12][i%31]) {
								 booked = true;	
								 break;
							 }else {
								 booked=false;
							 }
						 }else {
						 
							 if(!available[date[1]-1][i]) {
								 booked = true;	
								 break;
							 }else {
								 booked=false;
							 }
						 }
					 
				 }
				 if(!booked) return room;
			 }
		 }
		 return null;
	 }
	 
	 
	 public boolean isAvailable(UserOptions uo) {
//		 boolean flag=false;
//		 boolean[][] available;
//		 int date[]=uo.getDate();
		 
		 if(availableRoom(uo)==null) {
			 return false;
		 }else {
			 return true;
		 }
		 
//		 for(Room room:rooms) {
//			
////			 if(uo.getRoomType().equals(room.getType())&&room.getCapacity()==uo.getCapacityAsInt()) {
////				 available = room.getAvailable();
////				 for(int i=date[0];i<date[0]+uo.getDays();i++) {
////					 if(!available[date[1]-1][i]) {
////						 flag = false;	
////					 }else {
////						 flag = true;
////						 break;
////					 }
////				 }
////			 }
//		 }
//		 return flag;
	 }
	 
	
	 
	 public void calculatePrice(UserOptions uo) {
		
		 if(uo.getRoomType().equals("Suite")) 
			 price=price*2;
		 
		 price=price*uo.getPplNum();
		 
		
	 }
	 

	 
	 
	 
}


