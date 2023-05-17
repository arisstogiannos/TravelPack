package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelList {
	ArrayList<Hotel> hotels = new ArrayList<>();
	public static void main(String[] args) {
		HotelList hl = new HotelList();
		hl.createHotelList();
	}
	
	
	
	public void createHotelList() {
		
		 try {
		      File f = new File("hotels.txt");
		      Scanner myReader = new Scanner(f);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] arrOfStr =data.split(",", 5);
		        Hotel h = new Hotel(arrOfStr[0], arrOfStr[1], Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]));
		        hotels.add(h);
		        System.out.println(h.getName()+h.getCity()+h.getPrice());
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
