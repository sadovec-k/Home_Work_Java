import java.util.Scanner;
class HW47 {
	public static void main (String[] args){
		System.out.println("Enter the string: ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Enter a char: ");
		String h = in.next();
		if (h.length() > 1){
			System.out.println("Enter correct char");
		}	
		System.out.println("In string " + countChars(s, h) + " chars " + h);
	}

		static int countChars(String s, String h){
			int count = 0;
			for (int i = 0; i < s.length(); i++){
				if (s.charAt(i) == h.charAt(0)){
					count += 1;
				}
			}
			return count;
		}
}