class HW51 {
	public static void main (String[] args){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
						
		System.out.println("Avg of array " + avg(array));
	}

		static double avg(int array[]){
			double avg = 0;
			for (int i = 0; i < array.length; i++){
				avg +=array[i];
			}
			avg = avg / array.length;
			return avg;
		}
}