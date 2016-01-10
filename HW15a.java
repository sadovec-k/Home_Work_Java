import java.util.Scanner;
class HW15a {
	public static void main (String[] args){
		System.out.println("Enter seconds (N):");
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int min = n%360/60;
			int sec = n%360%60;
		System.out.println(min + "min " + sec + "sec");
		}
}