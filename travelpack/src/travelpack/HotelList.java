package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Η  κλάση HotelList διαβαζει το αρχειο hotels.txt στο οποιο 
//διατηρουνται τα στοιχεια των ξενοδοχειων και δημιουργεί μια λιστα τυπoυ Hotel
public class HotelList {

	public static ArrayList<Hotel> createHotelList(UserOptions uo) {
		ArrayList<Hotel> hotels = new ArrayList<>();

		try {
			File f = new File("resources/hotels.txt");
			Scanner myReader = new Scanner(f);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] arrOfStr = data.split(",", 5);
				Hotel h = new Hotel(arrOfStr[0].toUpperCase().trim(), arrOfStr[1].toUpperCase().trim(),
						Integer.parseInt(arrOfStr[2].trim()), Integer.parseInt(arrOfStr[3].trim()));
				h.calculatePrice(uo);

				hotels.add(h);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return hotels;
	}

}
