class HW24 {
	public static void main (String[] args){
			int n = args.length;
			if (n == 1) //Проверяем число введенных аргументов
			{ 
				if (Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > 12) {
							System.out.println("Enter correct argument");
							return; }
				int m = Integer.parseInt(args[0]); 
				String[] name = {"0", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "0"}; //последний ноль для симметрии
					if ((m > 2) && (m < 6)) {
						System.out.println(name[m] + " - Spring");
						}
						else if ((m > 5) && (m < 9)) {
							System.out.println(name[m] + " - Summer");
							}
							else if ((m > 8) && (m < 12)) {
								System.out.println(name[m] + " - Autumn");
								}
							else {System.out.println(name[m] + " - Winter");
							}
			}	
			else {
				System.out.println("Enter correct argument");
			}
	}
}