package busBooking;

import java.util.ArrayList;

public class MainBooking {
	
	public static void main(String[] args) {
		ArrayList<BusAttributes> Buses = new ArrayList<BusAttributes>();
		
		BusAttributes Bus1 = new BusAttributes(1, true, 2);		//Similar to below 2 lines.
		Buses.add(Bus1);
		
		Buses.add(new BusAttributes(2, false, 3));
		Buses.add(new BusAttributes(3, true, 2));
		
		ArrayList<TravellersDetail> List = new ArrayList<TravellersDetail>();
		
		
	}

}
