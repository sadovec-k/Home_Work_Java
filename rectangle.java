public class rectangle extends shape {

	private int sideA = 0;
	private int sideB = 0;
	//private int sideC = 0;
	
	
			
	public rectangle(int sideA, int sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
		//this.sideC = sideC;
	}	
	
	public void setSideA(int sideA){
		this.sideA = sideA;
	}
	public int getSideA(){
		return this.sideA;
	}
	
	public void setSideB(int sideB){
		this.sideB = sideB;
	}
	public int getSideB(){
		return this.sideB;
	}
	/*
	public void setSideC(int sideC){
		this.sideC = sideC;
	}
	public int getSideC(){
		return this.sideC;
	}
	*/
	public double getPerimetr(){
		return (this.sideA + this.sideB)*2;
	}
	public double getSquare(){
		//double p = 0;
		//p = (this.sideA + this.sideB + this.sideC)/2;
		return this.sideA*this.sideB;
	}
}
