class task2 {
	public static void main (String[] args){
		int[] array = new int[args.length]; 
		for (int i = 0; i < (args.length); i++){
			array[i] = Integer.parseInt(args[i]);
		}
						
		System.out.println("Max loos is " + max(array));
	}

		static int max(int[] array){
			int maxLoss = 0;
			int max = array[0];
			int min = array[array.length-1];
			int minNumber = array.length-1;
				
			for (int i = array.length-1; i > -1 ; i--){
				if (array[i] < min){
					min = array[i];
					minNumber = i;
				}
			}
			
			for (int i = 1; i < minNumber; i++){
				if (array[i] > max){
					max = array[i];
				}
			}
			
			maxLoss = max - min;
			
			return maxLoss;
		}
}