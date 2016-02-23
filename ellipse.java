public class ellipse extends shape {

	private int shortR = 0;
	private int longR = 0;
	
			
	public ellipse(int shortR, int longR) {
		this.shortR = shortR;
		this.longR = longR;		
	}	
	
	public void setShortr(int shortR){
		this.shortR = shortR;
	}
	public int getShortr(){
		return this.shortR;
	}
	
	public void setLongr(int longR){
		this.longR = longR;
	}
	public int getLongr(){
		return this.longR;
	}
	
	public double getPerimetr(){
		return (this.shortR + this.longR)*super.pi;
	}
	public double getSquare(){
		return this.shortR*this.longR*super.pi;
	}
}
