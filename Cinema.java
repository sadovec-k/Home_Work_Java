
public class Cinema {
	
	private String CinemaName = null;
	private String CinemaAdress = null;
	
	public Cinema (String name, String adress){
		this.setCinemaName(name);
		this.setCinemaAdress(adress);
	}

	public String getCinemaName() {
		return CinemaName;
	}

	public void setCinemaName(String CinemaName) {
		this.CinemaName = CinemaName;
	}

	public String getCinemaAdress() {
		return CinemaAdress;
	}

	public void setCinemaAdress(String CinemaAdress) {
		this.CinemaAdress = CinemaAdress;
	}
	
	@Override
	public String toString() {
		return "Name " + CinemaName + " adress " + CinemaAdress;
	}
	
}
