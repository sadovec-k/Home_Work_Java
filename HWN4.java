class HWN4 {
	
	public static void main(String[] args){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int a = Integer.parseInt(args[0]);
		
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		while (a > 0){
			for (int i = array.length-1; i > 0; --i )
			{	  
				array[i] = array[i-1];
			}
		
		array[0]=0;
		a--;
		}
		
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
}