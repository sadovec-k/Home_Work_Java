class HW30 {
	public static void main (String[] args){
		int n = args.length;
		int maxb;
		int mina;
		if (n == 2) //��������� ����� ��������� ����������
		{ 	
			if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])){
				maxb = Integer.parseInt(args[0]);
				mina = Integer.parseInt(args[1]);
			}
			else {
				maxb = Integer.parseInt(args[1]);
				mina = Integer.parseInt(args[0]);
			}
			int app = 1;
			while (maxb >= mina) {
				app *= mina;
				mina++;
			}
			System.out.println("App = " + app);
		}	
		else {
			System.out.println("Enter correct argument");
		}
			
	}
}