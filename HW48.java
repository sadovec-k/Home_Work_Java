class HW48 {
	public static void main (String[] args){
		int n = args.length;
		if (n != 3){
			System.out.println("Enter correct date");
		}	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
				
		System.out.println("The smallest number is  " + smallestNumber(a, b, c));
	}

		static int smallestNumber(int a, int b, int c){
			int min = a;
			if (b < min){
				min = b;
			}
			if (c < min) {
				min = c;
			}
			return min;
		}
}