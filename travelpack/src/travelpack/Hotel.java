package travelpack;

import java.util.ArrayList;

public class Hotel {
	
	private String name;
	private String city;
	private int price;
	private int code;
	ArrayList<Room> rooms;
	private Room availableRoom;
	
	
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
		rooms = createRoomList();
	}
	
	
	 public ArrayList<Room> createRoomList() {
		 ArrayList<Room> rooms = new ArrayList<>();
		String[] type = {"Simple","Suite"};
		int[] capacity= {1,2,3,4};
		
		for (int j = 0; j < type.length; j++) {
			for (int i = 0; i < capacity.length; i++) {
				for (int k = 0; k < 3; k++) {
					Room r = new Room(type[j], capacity[i], (j+1)*100 + (i+1)*10 +k);
					rooms.add(r);
				}
			}
		}
		
		return rooms;
		
		
	}
	 public boolean isAvailable(UserOptions uo) {
		 boolean flag=false;
		 boolean[][] available;
		 int date[]=uo.getDate();
		 for(Room room:rooms) {
			 if(uo.getRoomType().equals(room.getType())&&room.getCapacity()==uo.getCapacityAsInt()) {
				 available = room.getAvailable();
				 for(int i=date[0];i<date[0]+uo.getDays();i++) {
					 if(!available[date[1]-1][i]) {
						 flag = false;	
					 }else {
						 flag = true;
						 break;
					 }
				 }
			 }
		 }
		 return flag;
	 }
	 
	 public Room availableRoom(UserOptions uo) {
		 boolean flag=true;
		 boolean[][] available;
		 int date[]=uo.getDate();
		 for(Room room:rooms) {
			 if(uo.getRoomType().equals(room.getType())&&room.getCapacity()==uo.getCapacityAsInt()) {
				 available = room.getAvailable();
				 for(int i=date[0];i<date[0]+uo.getDays();i++) {
					 if(!available[date[1]-1][i]) {
						 flag = false;	
						 break;
					 }
				 }
				 if(flag) return room;
			 }
		 }
		 return null;
	 }
	 
	 public void calculatePrice(UserOptions uo) {
		
		 if(uo.getRoomType().equals("suite")) 
			 price=price*2;
		 
		 price=price*uo.getPplNum();
		 
		
	 }
}


