class recursion {
	public static void main (String[] args){
		int countArg = args.length;
		if (countArg >1){
			System.out.println("Enter correct date");
		}	
		else {
			int n = Integer.parseInt(args[0]);
			if (n < 1 || n > 20 ){
				System.out.println("Enter correct date! n must be smaller than 21 and bigger than 0");
			}
			else {		
			System.out.println("Factorial " + n + " = " + factorial(n));
			}
		}	
	}

		static long factorial(int n){
			long result = 0;
			if (n < 2){
				result = 1;
			}
			else {
				result = n * factorial(n-1);
			}
			return result;
		}
}