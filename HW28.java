class HW28 {
	public static void main (String[] args){
		int n = args.length;
		if (n == 2) //Проверяем число введенных аргументов
		{ 
			if (Integer.parseInt(args[1]) < 1 || Integer.parseInt(args[1])>12) {
					System.out.println("Enter correct argument");
					return; }
				else if ((Integer.parseInt(args[1]) == 2) && ((Integer.parseInt(args[0]) < 1) || (Integer.parseInt(args[0])>29))) {
						System.out.println("Enter correct argument");
						return;}
					else if ((Integer.parseInt(args[1]) == 4 || Integer.parseInt(args[1]) == 6 || Integer.parseInt(args[1]) == 9 || Integer.parseInt(args[1]) == 11) && (Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0])>30))
							{System.out.println("Enter correct argument");
							return;}
						else if ((Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0])>31))
								{System.out.println("Enter correct argument");
								return;}
							else {
								int d = Integer.parseInt(args[0]); 
								int m = Integer.parseInt(args[1]);
								String[] name = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Saggitarius", "Capricorn"}; 
								int[] date = {0,                 2001,      1902,     2103,    2004,     2105,    2206,     2307,   2308,    2309,    2310,        2311,         2212, 2001};
									if ((m == date[m]%100 && d >= date[m]/100) || (m == date[m+1]%100 && d < date[m+1]/100)){
										System.out.println("Date " + d + ". " + m + " is " + name[m]);
									}
									else {
										System.out.println("Date " + d + ". " + m + " is " + name[m-1]);
									}
							}
		}	
		else {
			System.out.println("Enter correct argument");
		}
			
	}
}