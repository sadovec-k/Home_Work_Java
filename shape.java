public abstract class shape {

	private double perimetr = 0;
	private double square = 0;
	String color;
	double pi = 3.14;
				
	public abstract double getPerimetr();
	public abstract double getSquare();
	public void getColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}	

}
