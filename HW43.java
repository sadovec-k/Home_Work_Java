class HW43 {
	
	public static void main(String[] args){
		int array[] = {7, 2, 3, 49, 5, 77, 34, 8, 11, 10};
		int k = Integer.parseInt(args[0]);
		int f = 0;
		for (int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
			for (int i = 0; i < array.length; ++i )
			{	  
				if (k < array[i] && f == 0){
					System.out.println("Element number " + i + " more than K");
					f = 1;
					i = array.length;
				}
			}
		if (f == 0){
		System.out.println(0);
		}
	}
	
}