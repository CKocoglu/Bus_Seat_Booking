
public class Seat 
{
	private int seatID;
	private boolean status;
	private Passenger passenger;
	
	public Seat(int seatID) 
	{
        this.status = false;
        this.passenger = null;
		this.seatID = seatID;
	}

	public int getSeatID() {
		return seatID;
	}

	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	@Override
	public String toString() {
		return "Seat [seatID=" + seatID + ", status=" + status + ", passenger=" + passenger.toString() + "]";
	}

}
