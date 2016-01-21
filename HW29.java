class HW29 {
	public static void main (String[] args){
		int n = args.length;
		int maxb;
		int mina;
		if (n == 2) //Проверяем число введенных аргументов
		{ 	
			if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])){
				maxb = Integer.parseInt(args[0]);
				mina = Integer.parseInt(args[1]);
			}
			else {
				maxb = Integer.parseInt(args[1]);
				mina = Integer.parseInt(args[0]);
			}
			int sum = 0;
			while (maxb >= mina) {
				sum += mina;
				mina++;
			}
			System.out.println("Sum = " + sum);
		}	
		else {
			System.out.println("Enter correct argument");
		}
			
	}
}