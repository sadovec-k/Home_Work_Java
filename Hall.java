
public class Hall extends Cinema {
	private String HallName = null;
	
	public Hall(String name, String adress, String Hall) {
		super(name, adress);
		this.setHallName(Hall);
		}

	public String getHallName() {
		return HallName;
	}

	public void setHallName(String hall) {
		HallName = hall;
	}
	@Override
	public String toString() {
		return "Name " + super.getCinemaName() + " adress " + super.getCinemaAdress() + " Hall name " + HallName;
	}
	
}
