
public class Film {
	private String FilmName = null;
	private double FilmDate = 0.0;
	private String FilmDescription = null;
	
	public Film(String FilmName, double FilmDate, String FilmDescription){
		this.setFilmName(FilmName);
		this.setFilmDate(FilmDate);
		this.setFilmDescription(FilmDescription);
	}

	public String getFilmName() {
		return FilmName;
	}

	public void setFilmName(String filmName) {
		this.FilmName = filmName;
	}

	public double getFilmDate() {
		return FilmDate;
	}

	public void setFilmDate(double filmDate) {
		this.FilmDate = filmDate;
	}

	public String getFilmDescription() {
		return FilmDescription;
	}

	public void setFilmDescription(String filmDescription) {
		this.FilmDescription = filmDescription;
	}
	@Override
	public String toString() {
		return "Film name " + FilmName + " Film date " + FilmDate + " Film Description " + FilmDescription;
	}
}
