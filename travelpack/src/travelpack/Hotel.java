package travelpack;

import java.util.ArrayList;

public class Hotel {
	
	private String name;
	private String city;
	private int price;
	private int code;
	ArrayList<Room> rooms = new ArrayList<>();
	
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
		
	}
	
	
	 void createRoomList() {
		String[] type = {"simple","suite"};
		int[] capacity= {1,2,3,4};
		
		for (int j = 0; j < type.length; j++) {
			for (int i = 0; i < capacity.length; i++) {
				for (int k = 0; k < 3; k++) {
					Room r = new Room(type[j], capacity[i], (j+1)*100 + (i+1)*10 +k);
					rooms.add(r);
					System.out.println(r.getCode());
				}
			}
		}
		
		
	}
	 
	 public void calculatePrice(UserOptions uo) {
		
		 if(uo.getRoomType().equals("suite")) {
			 price=price*2;
		 }
		 
		
	 }
}


