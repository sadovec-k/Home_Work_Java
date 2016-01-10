import java.util.Scanner;
class HW7 {
	public static void main (String[] args){
		System.out.println("Enter the temperature (F):");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
		System.out.println(a + "(F) = "+ ((a-32)*5/9) + "(C)");
		}
}