package busBooking;

public class BusAttributes {

	private int BusID;				//Whenever use private always write methods to access from other classes.
	private boolean AC;				// Get and set method properties is always done to get and send the value and to set and change the value.
	private	int Capacity;		
	
	
	public BusAttributes(int BusID, boolean AC, int Capacity) {
	this.BusID = BusID;
	this.AC = AC;
	this.Capacity = Capacity;
	}

	public int getCapacity() {		//accessor method
		return Capacity;
	}
	
	public void setCapacity(int cap) {
		Capacity = cap;				//mutator
	}
	
	public boolean getAC() {		//accessor method
		return AC;
	}
	
	public void setAC(boolean value) {		//mutator
		AC = value;
	}
	
	public int getBusID() {		//accessor method
		return BusID;
	}
	
	public void setBusID(int BusID) {		//mutator 
		this.BusID = BusID;
	}
	
	
	
	
	public void DisplayBus() {
		System.out.println("Bus ID = " + BusID + "Is AC = " + AC + "Total Capacity = " + Capacity);
	}
	
}
