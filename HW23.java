class HW23 {
	public static void main (String[] args){
			int n = args.length;
			if (n == 1) //Проверяем число введенных аргументов
			{ 
				if (Integer.parseInt(args[0]) < 1||Integer.parseInt(args[0])>9999) {
							System.out.println("Enter correct argument");
							return; }
				int year = Integer.parseInt(args[0]); 
					if (year % 4 == 0) {
						if ((year % 100 == 0) && (year % 400 != 0)) {
							System.out.println("This year has 365 days");}
						else{
							System.out.println("This year has 366 days");}}
					else {
							System.out.println("This year has 365 days");}
			}	
			else {
				System.out.println("Enter correct argument");
			}
			
		}
}