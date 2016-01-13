class HW8 {
	public static void main (String[] args){
		int km = Integer.parseInt(args[0]);
		float l = Float.parseFloat(args[1]);
		float p = Float.parseFloat(args[2]);
		System.out.println(l*100/km + " Litrov na 100 km " + "\n" + (l*p/km) + " - Price per 1 km");
		}
}