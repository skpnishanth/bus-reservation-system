package busBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TravellersDetail {
	String PassengerName;
	int busNo;
	Date date;

	public TravellersDetail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the passenger Name: ");
		PassengerName =  scan.next();

		System.out.println("Enter the Bus Number: ");
		busNo = scan.nextInt();

		System.out.println("Enter the date in the format dd-mm-yyyy"); //Date will be saved as String. Convert it to date format
		String DateInput = scan.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = dateFormat.parse(DateInput);
		} catch (ParseException e) {
			System.out.println("An error occurred while parsing the date");
			e.printStackTrace();
		}

		//scan.close();

	}



	public boolean isAvailable(ArrayList<BusAttributes> buses, ArrayList<TravellersDetail> list) {
		int capacity = 0;
		for (BusAttributes bus: buses ) {
			if(bus.getBusID() == busNo)
				capacity = bus.getCapacity();
		}

		int booked = 0;
		for(TravellersDetail person:list) {
			if(person.busNo == busNo && person.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}


}
