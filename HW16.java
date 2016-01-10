import java.util.Scanner;
class HW16 {
	public static void main (String[] args){
		System.out.println("Enter the day's number (K):");
			Scanner in = new Scanner(System.in);
			int k = in.nextInt();
			int dn = k%7+2;
			String[] name = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println("Day number " + dn + " in a week:" + " " + name[dn-1]);
		}
}