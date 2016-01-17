class HW17 {
	public static void main (String[] args){
			int a = Integer.parseInt(args[0]); 
			int n = args.length;
			if (n == 1){ 
			if (a < 0){a = -a;}
			if ((a/100>0)&&(a%2>0)&&(a/1000<1)) {
				System.out.println("Number \"a\" is uneven and has three ciphers");
			} else{
				System.out.println("Number \"a\" is even or has less or more then three ciphers");
			}
			}
			else {
				System.out.println("Enter correct argument");
			}
		}
}