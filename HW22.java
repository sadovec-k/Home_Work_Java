class HW22 {
	public static void main (String[] args){
			int n = args.length;
			if (n == 4) //ѕровер€ем число введенных аргументов
			{ 
				int i = 0;
					while (i < 4){
						if (Integer.parseInt(args[i]) < 1||Integer.parseInt(args[i])>8) {
							System.out.println("Enter correct argument");
							return; }
					i++;					
					}
				int x1 = Integer.parseInt(args[0]); 
				int y1 = Integer.parseInt(args[1]);
				int x2 = Integer.parseInt(args[2]);
				int y2 = Integer.parseInt(args[3]);
			/* ‘ерзь может ходить по горизонтале, вертикале и диагонале,
			 * т.е. при ходе по горизонтале или вертикале одна из координат х или у останетс€ неизменной 
			 * а при ходе по диагонале прирощение х и у будет одинаковым.
			*/
					if ((x1 == x2) || (y1 == y2) || (x1 + 8 - x2 == y1 + 8 - y2)) {
						System.out.println("Right step");}
					else{
						System.out.println("Wronght step");
					}}	
			else {
				System.out.println("Enter correct argument");
				}
			
		}
}