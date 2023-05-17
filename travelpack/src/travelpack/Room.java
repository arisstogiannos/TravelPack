package travelpack;

public class Room {
	private int price = 0;
	private int code;
	private String type;
	private int capacity;
	private boolean[][] available = new boolean[12][31];
	
	public Room(String type, int capacity, int code) {
		this.code=code;
		this.type = type;
		this.capacity = capacity;
		for(int i = 0; i<12;i++) {
			for(int j = 0;j<31;j++) {
				available[i][j] = true;
			}
		}
	}
	
	public int CalculateRoomPrice(String type,int capacity){
		
		return price;
	}
	
	public int getCode() {
		return this.code;
	}
	
	
}
