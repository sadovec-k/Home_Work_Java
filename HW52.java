class HW52 {
	public static void main (String[] args){
		int n = args.length;
		if (n != 3){
			System.out.println("Enter correct date");
		}	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
						
		System.out.println("Answer is " + MaxS(a,b,c));
	}

		static int MaxS(int a, int b, int c){
			int s = 0;
			if (a < b && a < c){
				s = b*b + c*c;
			}
			else if (b < a && b < c){
				s = a*a + c*c;
			}
			else {
				s = a*a + b*b;
			}
			return s;
		}
}