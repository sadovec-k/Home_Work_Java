class HW18 {
	public static void main (String[] args){
			int a = Integer.parseInt(args[0]); 
			int n = args.length;
			if (n == 1) //��������� ����� ��������� ����������
			{ 
				if (a < 0){a = -a;} // ��������� ���� ���������
				if ((a/100>0)&&(a/1000<1)) //��������� ����������� ����� "�" ��� ���
				{
					if (((a/100)<((a%100)/10))&&(((a%100)/10)<((a%100)%10))) {
						System.out.println("Number \"a\" is correct");}
					else{
						System.out.println("Number \"a\" is uncorrect");
					}	
				}
				else {
				System.out.println("Enter correct argument");
				}
			}
		}
}