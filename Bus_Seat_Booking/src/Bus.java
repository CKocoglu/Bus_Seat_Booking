
public class Bus 
{
	private String plate;
	private int passengerCount;
	private Seat[] seats;
	
	public Bus(String plate, int capasity)
	{
		this.plate = plate;
		
		seats = new Seat[capasity];
		
		for(int i=0;i<capasity;i++)
		{
			seats[i] = new Seat(i+1);
		}
		
		this.passengerCount = 0;
	}
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
	public boolean bookSeat(Passenger p, int seatID)
	{
		if(!seats[seatID-1].isStatus())
		{
		   seats[seatID-1].setPassenger(p);
		   seats[seatID-1].setStatus(true);
		   passengerCount++;
		   return true;
		}
		else
		{
			return false;
		}
	}
	
	public String printAllPassengers()
	{
		String str = "";
		for(int i=0;i<seats.length;i++)
		{
			if(seats[i].isStatus())
			{
				str +=seats[i].toString() + "\n";
			}
		}
		
		return str;
	}
	
	public String printAllAvailableSeatIDs()
	{
		String str = "";
		for(int i=0;i<seats.length;i++)
		{
			if(!seats[i].isStatus())
			{
				str += "SeatId: " + seats[i].getSeatID() + "\n";
			}
		}
		
		return str;
	}
	
	public String search(String name, String surname)
	{
		String str = "";
		for(int i=0;i<seats.length;i++)
		{
			if(seats[i].isStatus() &&
			   seats[i].getPassenger().getName().equals(name) &&
			   seats[i].getPassenger().getSurname().equals(surname))
			{
				 str += seats[i].getPassenger().getPhone().toString() + "\n";
			}
		}
		
		return str;
	}

}



