package travelpack;

public class CompleteBooking {
	
	
	public static void bookRoom(Hotel hotel,UserOptions uo) {
		 boolean[][] available = new boolean[12][31];
		 int[] date=uo.getDate();
		 System.out.println("op");
		for(Room room:hotel.rooms) {
			if(room.getType().equals(uo.getRoomType())) {
				available=room.getAvailable();
				for (int i = date[0]; i <= date[0] + uo.getDays(); i++) {
					available[date[1]][i]=false;
					System.out.println(i+" : "+date[1]);
					System.out.println(available[date[1]][i]);

				} 
				break;
			}
		}
	}

}
