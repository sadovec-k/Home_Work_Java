import java.util.Random;
class HW46 {
	public static void main(String[] args){
		Random rand = new Random();
		int n = Integer.parseInt(args[0]);
		int array[];
		array = new int[n];
		for (int i = 0; i < n; ++i) {
			array[i] = rand.nextInt(100)+1;
		}
		int min = 0;
		int p = 0;
		for (int i = 0; i < n-1; ++i){
			min = array[i];
			for(int j = i; j < n; ++j){
				if (array[j] < min){
					min = array [j];
					p = j;
				}
			}
			array[p] = array[i];
			array[i] = min;
		}
		// print array before
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// print array after
		System.out.print(array[0] + " ");
		for (int i = 0; i < n - 1; ++i){
			if (array[i] != array[i+1]){
				System.out.print(array[i+1] + " ");
			}
		}
		System.out.println();
	}
}