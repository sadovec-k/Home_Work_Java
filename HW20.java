class HW20 {
	public static void main (String[] args){
			int n = args.length;
			if (n == 4) //��������� ����� ��������� ����������
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
			/* �� ��������� ����� ���������� ���� ����� ����, 
			 * ����� ��������� ������� ����� ���������� ��������.
			 * ��������, ���� ����� ��������� ��������� � ������ ������� ����, ��:
			 * ����� ��������� � ���� ������ ����� �����, 
			 * � ����� ��������� ���� ����� ����� �������. 
			 * �.�. ���� ��� ������ ����� ���� ����, �� ����� ���� �� ��������� �����,
			 * � ���� ����� ������ �� �������.
			*/
					if (((x1 + y1 + x2 + y2) % 2) == 0) {
						System.out.println("Plases have the same color");}
					else{
						System.out.println("Plases have different color");
					}}	
			else {
				System.out.println("Enter correct argument");
				}
			
		}
}