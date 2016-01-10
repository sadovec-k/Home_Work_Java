import java.util.Scanner;
class HW6 {
	public static void main (String[] args){
		System.out.println("Enter the temperature (F):");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = (a-32)*5/9;
		System.out.println(a + "(F) = "+ b + "(C)");
		}
}