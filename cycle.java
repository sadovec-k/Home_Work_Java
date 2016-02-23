public class cycle extends shape {

	
	private int radius = 0;
	
	public cycle(int radius) {
		this.radius = radius;
	}	
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return this.radius;
	}
	
	public double getPerimetr(){
		return this.radius*super.pi*2;
	}
	public double getSquare(){
		return this.radius*this.radius*super.pi;
	}
}
