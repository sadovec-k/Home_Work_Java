import java.util.Scanner;
class task1 {
	public static void main (String[] args){
		String[] str = new String[10];
		Double[] c = new Double[10];
			// Enter strings in array
		str = enterString();
			// 	Count GC-content for each string	
		for (int i = 0; i < 10; i++){
			String temp = str[i];
			c[i] = count(temp);
		}
			// Enter in array numbers of strings with max GC-content. If several strings have the same max GC-content.  
		int[] maxst = max(c);
			// Print array of strings with max GC-content.
		System.out.print("Max GC-content in strings number : ");
		for (int i = 0; i < maxst.length; ++i){
			System.out.print(maxst[i] + ",  ");
		}
	}
			// Enter strings in array from console
		static String[] enterString(){
			String[] str = new String[10];
			for (int i = 0; i < 10; i++){
				System.out.println("Enter string number " + (i + 1) + " : ");
				Scanner in = new Scanner(System.in);
				str[i] = in.nextLine();
			}
			return str;
		}
			// Count GC-content for each string
		static double count(String temp){
			double n;
			double count = 0;
			for (int i = 0; i < temp.length(); i++){
				if (temp.charAt(i) == 'g' || temp.charAt(i) == 'c'){
					count += 1;
				}
			}
			n = count*100/temp.length();
			return n;
		}
			// Find max GC-content and numbers of string having it
		static int[] max(Double[] c){
			int j = 0;
			int maxstCount = 0;
			double MaxC = c[0];
				// Find max GC-content
			for (int i = 1; i < (c.length-1); i++){
				if (c[i] > MaxC){
					MaxC = c[i];
				}
			}
				// Count how many strings have max GC-content
			for (int i = 0; i < c.length; i++){
				if (c[i] == MaxC){
					maxstCount ++;
				}
			}
				// Enter in array numbers of strings 
			int[] maxst = new int[maxstCount];
			for (int i = 0; i < c.length; i++){
				if (c[i] == MaxC){
					maxst[j] = i + 1;
					j++;
				}
			}
			return maxst;
		}
}