package travelpack;

import java.io.FileWriter;
import java.io.IOException;

public class CompleteBooking {
	
	
	public static void bookRoom(Hotel hotel,UserOptions uo) {
		boolean[][] available;
		Room availableRoom;
		 int[] date=uo.getDate();
		for(Room room:hotel.rooms) {
			if(hotel.isAvailable(uo)) {
				available=room.getAvailable();
				availableRoom=hotel.availableRoom(uo);
				
					try {
				      FileWriter myWriter = new FileWriter("Bookings.txt",true);
				      myWriter.write(uo.getDateAsString()+"/"+uo.getDays()+"/"+hotel.getName()+"/"+availableRoom.getCode()+System.lineSeparator());
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }

				room.setAvailable(available);
				break;
			}
		}
	}
}
