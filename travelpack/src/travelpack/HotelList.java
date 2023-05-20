package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelList {
	static ArrayList<Hotel> hotels = new ArrayList<>();




	public static void createHotelList(UserOptions uo) {
		
		 try {
		      File f = new File("hotels.txt");
		      Scanner myReader = new Scanner(f);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] arrOfStr =data.split(",", 5);
		        Hotel h = new Hotel(arrOfStr[0], arrOfStr[1], Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]));
		        h.calculatePrice(uo);
		        hotels.add(h);
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public static ArrayList<Hotel> getHotels() {
		return hotels;
	}

}


