package busBooking;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBooking {

	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		ArrayList<BusAttributes> Buses = new ArrayList<BusAttributes>();

		BusAttributes Bus1 = new BusAttributes(1, true, 2);		//Similar to below 2 lines.
		Buses.add(Bus1);

		Buses.add(new BusAttributes(2, false, 3));
		Buses.add(new BusAttributes(3, true, 2));

		for (BusAttributes bus:Buses) {
			bus.DisplayBus();
		}


		ArrayList<TravellersDetail> List = new ArrayList<TravellersDetail>();

		int i = 1;
		while(i==1) {
			System.out.println("Enter 1 to book and 2 to exit:");		
			i = scan.nextInt();
			if(i==1) {
				TravellersDetail travellers = new TravellersDetail();
				if(travellers.isAvailable(Buses, List)) {
					List.add(travellers);
					System.out.println("Booked Successfully");
				}
				else 
					System.out.println("Bus is Full");
			}


		}
		scan.close();
		System.out.println("We are done");
	}
}
