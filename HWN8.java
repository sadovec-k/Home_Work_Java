class HWN8 {
	
	public static void main(String[] args){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		int a = Integer.parseInt(args[0]);
		
		if (a > array.length){
			a = a%array.length;
		} 
		
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length/2; ++i){
			int n = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = n;
		}
						
		for (int i = 0; i < a/2; ++i) {
			int n = array[i];
			array[i] = array[a-1-i];
			array[a-1-i] = n;
		}
				
		int count = 0;
		for (int i = a; i < ((array.length-a)/2+a); ++i) {
			int n = array[i];
			array[i] = array[array.length-1-count];
			array[array.length-1-count] = n;
			count +=1;
		}
		
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
}