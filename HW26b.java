class HW26b {
	public static void main (String[] args){
			int n = args.length;
				if (n == 1) //Проверяем число введенных аргументов
				{ 
					if (Integer.parseInt(args[0]) < 100 || Integer.parseInt(args[0]) > 999) {
							System.out.println("Enter correct argument");
							return; }
				int d = Integer.parseInt(args[0]); 
				String[] h = {"0", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"}; 
				String[] s = {"0", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
				String[] m = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
				String[] dec = {"0", "0", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
				int a = d/100;
				int b = d%100/10;
				int c = d%100%10;
					if ((b == 0) && (c == 0)) {
						System.out.println(h[a]);
					}
						else if (b == 0) {
							System.out.println(h[a] + " " + s[c]);
						}
							else if (b == 1) {
								System.out.println(h[a] + " " + m[c]);
							}
								else if (c == 0) {
									System.out.println(h[a] + " " + dec[b]);
								}
						else {
							System.out.println(h[a] + " " + dec[b] + " " + s[c]);
						}
				}
				else {
					System.out.println("Enter correct argument");
				}
	}
}
