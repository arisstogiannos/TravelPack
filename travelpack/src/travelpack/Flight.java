package travelpack;

import java.util.Random;

public class Flight {
	
	private String name;
	private String departureCity;
	private String destinationCity;
	private int price;
	private String type;
	private boolean baggage;
	private int[] date;
//	private int[] time;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartureCity() {
		return departureCity;
	}


	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isBaggage() {
		return baggage;
	}


	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}


	public int[] getDate() {
		return date;
	}


	public void setDate(int[] date) {
		this.date = date;
	}


	public Flight(String departureCity, String destinationCity, String type, 
			      boolean baggage, int[] date) {
		this.name="Pamak AirLines";
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.type = type;
		this.baggage = baggage;
		this.date = date;
		this.price = calculatePrice(baggage, type);
	}
	
	
	public int calculatePrice(boolean baggage, String type) {
		Random rand = new Random();
		int price=rand.nextInt(120-80+1)+80;
		if(baggage) {
			price+=20;
		}
		if(type.equals("AClass")) {
			price = price * 3;
		}else if(type.equals("BClass")) {
			price = price * 2;
		}
		
		return price;
	}
	
}
