import java.util.Scanner;
class HW5 {
	public static void main (String[] args){
		System.out.println("Enter a");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
				a = a*a;
			int b = a*a;
		System.out.println("a^2 = "+ a +" a^4 = "+ b + " a^8 = " + b*b);
			
		}
}