package busBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TravellersDetail {
	String PassengerName;
	int busNo;
	Date date;
	
	public TravellersDetail() throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the passenger Name: ");
		scan.next();
		
		System.out.println("Enter the Bus Number: ");
		scan.nextInt();
		
		System.out.println("Enter the date in the format dd-mm-yyyy"); //Date will be saved as String. Convert it to date format
		String DateInput = scan.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		date = dateFormat.parse(DateInput);
		
		scan.close();

	}
	
	
}
