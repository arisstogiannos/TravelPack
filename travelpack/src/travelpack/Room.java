package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Room {
	private int priceMulti = 1;
	private int code;
	
	public void setAvailable(boolean[][] available) {
		this.available = available;
	}

	private String type;
	private int capacity;
	private boolean[][] available = new boolean[12][31];
	
	public Room(String type, int capacity, int code) {
		this.code=code;
		this.type = type;
		this.capacity = capacity;
		this.priceMulti=CalculateRoomPrice();
		

//		 try {
//		      File f = new File("Bookings.txt");
//		      Scanner myReader = new Scanner(f);
//		      while (myReader.hasNextLine()) {
//		        String data = myReader.nextLine();
//		        String[] arrOfStr =data.split("/", 7);
//		        
//		       
//		        
//		      }
//		      myReader.close();
//		    } catch (FileNotFoundException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
		
		for(int i = 0; i<12;i++) {
			for(int j = 0;j<31;j++) {
				available[i][j] = true;
			}
		}
	}
	
	public int CalculateRoomPrice(){
		
		if(type.equals("suite")) {
			priceMulti=2;
		}
		
		return priceMulti;
	}
	
	public int getPriceMulti() {
		return priceMulti;
	}

	public String getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean[][] getAvailable() {
		return available;
	}

	public int getCode() {
		return this.code;
	}
	
	
}
