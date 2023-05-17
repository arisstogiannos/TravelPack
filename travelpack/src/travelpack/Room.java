package travelpack;

public class Room {
	private int code;
	private String type;
	private int capacity;
	private boolean[][] available = new boolean[12][31];
	
	public Room(String type, int capacity, boolean[][] available, int code) {
		this.code=code;
		this.type = type;
		this.capacity = capacity;
		for(int i = 0; i<12;i++) {
			for(int j = 0;i<31;j++) {
				available[i][j] = true;
			}
		}
	}
	
}
