class HW19 {
	public static void main (String[] args){
			int a = Integer.parseInt(args[0]); 
			int n = args.length;
			if (n == 1) //��������� ����� ��������� ����������
			{ 
				if (a < 0){a = -a;} // ��������� ���� ���������
				if ((a / 1000 > 0) && (a / 10000 < 1 )) //��������� �������������� ����� "�" ��� ���
				{
					if (((a/1000)==(a%1000%100%10))&&((a%1000/100)==(a%1000%100/10))) {
						System.out.println("Number \"a\" is polindrom");}
					else{
						System.out.println("Number \"a\" is not polindrom");
					}	
				}
				else {
				System.out.println("Enter correct argument");
				}
			}
		}
}