package travelpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
	private int day;
	private int month;
	private int year;
	private int days;
	private String hotelName;
	private int code;
	





	public Booking(int day, int month, int year, int days, String hotelName, int code) {

		this.day = day;
		this.month = month;
		this.year = year;
		this.days = days;
		this.hotelName = hotelName;
		this.code = code;
	}
	
	 public static ArrayList<Booking> createBookings() {
		 ArrayList<Booking> bookings =new ArrayList<>();
		 String a[]= new String[6];
		 
		 try {
		      File f = new File("Bookings.txt");
		      Scanner myReader = new Scanner(f);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        a =data.split("/", 6);
		        bookings.add(new Booking(Integer.parseInt(a[0]),Integer.parseInt(a[1]),
		        			 Integer.parseInt(a[2]),Integer.parseInt(a[3]),a[4],Integer.parseInt(a[5]))); 
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 return bookings;
	 }





	public static void bookRoom(Hotel hotel,UserOptions uo) {
			Room availableRoom;
		
			if(hotel.isAvailable(uo)) {
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
			}
		}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDays() {
		return days;
	}

	public String getHotelName() {
		return hotelName;
	}

	public int getCode() {
		return code;
	}
	
	}

