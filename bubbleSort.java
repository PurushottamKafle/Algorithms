package sortings;
public class bubbleSort {
	/**
	 * This is bubble sort algo.
	 * @param args
	 */
	public static void main(String [] args) {
		int i,j;
		int numbers[] = {34,67,2,4,5,12,90,40,99};
		// now main logics
	

	
			for(i=0; i<numbers.length-1; i++) {
			for(j =0; j<numbers.length-1-i; j++) {
				if(numbers[j]>numbers[j+1]) {
					// swappinh
					int temp;
					temp = numbers[j];
					numbers[j] =numbers[j+1];
					numbers[j+1] = temp;
					
			}
			
			
		}
	
	}
		for(i =0; i<numbers.length; i++) {

			System.out.println(numbers[i]);

			}
		
	}
}


