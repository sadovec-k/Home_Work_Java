import java.util.Scanner;
class HW58 {
	public static void main (String[] args){
		System.out.println("Enter tariff per hour: ");
		Scanner in = new Scanner(System.in);
		int tax = in.nextInt();
			if (tax >= 8 ){
				System.out.println("Enter hours: ");
				int h = in.nextInt();
				if (h <= 40) {
					int s = tax * h;
					System.out.println("Salary per week: " + s);
				}
				else if (h > 40 && h <= 60){
					double addh = h - 40;
					double s = tax * (40 + addh * 1.5);
					System.out.println("Salary per week: " + s);
				}
				else {
				System.out.println("Enter correct arguments");
				return;
			}
			}
			else {
				System.out.println("Enter correct arguments");
				return;
			}
	}
}