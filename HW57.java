import java.util.Scanner;
import java.util.Random;
class HW57 {
	public static void main (String[] args){
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int a = 0;
		System.out.println("For start a new game enter \"new\"\nFor exit enter \"exit\" \n");
		while (a < 1) {
				String str = in.nextLine(); 
			if (str.compareTo("new") == 0){
				int rnd = rand.nextInt(100) + 1;
				//System.out.println("rnd = " + rnd);
				int count = 1;
				int i = 0;
			while (i<100) {
				System.out.println("\nEnter your number \n");
				int enter = in.nextInt();
				if (enter == rnd){
					if (count < 3) {
						System.out.println("You guessed a number, but looks like you are a cheater!");
						System.out.println("You did " + count + " steps");
					}
					else if ((count >= 3) && (count < 7)) {
						System.out.println("Congrats, you guessed a number!");
						System.out.println("You did " + count + " steps");
					}
					else {
						System.out.println("You guessed a number, but can be better!");
						System.out.println("You did " + count + " steps");
					}
					i=100;
				}
				else if (rnd > enter){
					System.out.println("Try again - guessed number is bigger");
					System.out.println("You did " + count + " steps");
					count++;
				}
				else {
					System.out.println("Try again - guessed number is smaller");
					System.out.println("You did " + count + " steps");
					count++;
				}
			}
			}
			else if (str.compareTo("exit") == 0){
				break;
			}
			else {
				System.out.println("For start a new game enter \"new\"\nFor exit enter \"exit\" \n");
			}
		}
		System.out.println("By!");
	}
}