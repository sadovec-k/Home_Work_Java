import java.util.Scanner;
class HW15b {
	public static void main (String[] args){
		System.out.println("Enter seconds (N):");
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
		System.out.println(n/360 + "h  " + (n%360/60) + "min " + (n%360%60) + "sec");
		}
}