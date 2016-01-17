class HW21 {
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
			/* Ћадь€ может ходить только по горизонтале или вертикале,
			 * т.е. одна из координат х или у останетс€ неизменной.
			*/
					if ((x1 == x2) || (y1 == y2)) {
						System.out.println("Right step");}
					else{
						System.out.println("Wronght step");
					}}	
			else {
				System.out.println("Enter correct argument");
				}
			
		}
}