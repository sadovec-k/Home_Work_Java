class HWN1 {
	
	public static void main(String[] args){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int n = array[0];
		
		for (int i = 0; i < array.length-1; ++i )
		{  
			array[i] = array[i+1];
		}
		
		array[array.length-1]=n;
		
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
}