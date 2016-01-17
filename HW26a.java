class HW26a {
	public static void main (String[] args){
			int n = args.length;
				if (n == 1) //Проверяем число введенных аргументов
				{ 
					if (Integer.parseInt(args[0]) < 100 || Integer.parseInt(args[0]) > 999) {
							System.out.println("Enter correct argument");
							return; }
				int d = Integer.parseInt(args[0]); 
				String[] h = {"0", "one", "two", "tree", "four", "five", "six", "seven", "eight", "nine"}; 
				String[] m = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
				String[] dec = {"0", "0", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
				int a = d/100;
				int b = d%100/10;
				int c = d%100%10;
					if ((b == 0) && (c == 0)) {
						System.out.println(h[a] + " hundred ");
					}
						else if (b == 0) {
							System.out.println(h[a] + " hundred" + " and " + h[c]);
						}
							else if (b == 1) {
								System.out.println(h[a] + " hundred and " + m[c]);
							}
								else if (c == 0) {
									System.out.println(h[a] + " hundred " + dec[b]);
								}
						else {
							System.out.println(h[a] + " hundred " + dec[b] + " " + h[c]);
						}
				}
				else {
					System.out.println("Enter correct argument");
				}
	}
}
