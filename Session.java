
public class Session extends Hall {
	private String SessionName = null;
	private Double SessionTime = 0.0;
	private Film FilmName = null;
	
	public Session(String name, String adress, String Hall, String Session, Double sTime, Film FilmName) {
		super(name, adress, Hall);
		this.setSessionName(Session);
		this.setSessionTime(sTime); 
		this.FilmName = FilmName;
	}

	public String getSessionName() {
		return SessionName;
	}

	public void setSessionName(String sessionName) {
		this.SessionName = sessionName;
	}

	public Double getSessionTime() {
		return SessionTime;
	}

	public void setSessionTime(Double sessionTime) {
		this.SessionTime = sessionTime;
	}

	public Film getFilmName() {
		return FilmName;
	}

	public void setFilmName(Film filmName) {
		this.FilmName = filmName;
	}
	
	@Override
	public String toString() {
		return "Name " + super.getCinemaName() + " adress " + super.getCinemaAdress() + 
				" Hall name " + super.getHallName() + " Session Name " + SessionName + 
				" Film name " + FilmName + " Sesion time" + SessionTime + " Film Name " + FilmName;
	}
	

}
