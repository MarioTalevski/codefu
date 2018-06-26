
public class DivisorSort {
	
	public static void main(String[] args) {
		int[] original = {2, 3, 4, 5, 6};
		int[] divisors = new int[original.length];
		int tmp, counter = 0;
		
		// Number of divisors
		for(int i=0; i<original.length; i++) {
			for(int j=1; j<original[i]+1; j++) {
				if(original[i] % j == 0) {
					counter ++;
				}
			}
			divisors[i] = counter;
			counter = 0;
		
		}

		// Sort
		for(int i=0; i<original.length;i++) {
			for(int j=i+1; j<original.length; j++) {
				if(divisors[i] < divisors[j]) {
					tmp = divisors[i];
					divisors[i] = divisors[j];
					divisors[j] = tmp;
					
					tmp = original[i];
					original[i] = original[j];
					original[j] = tmp;
				}
				else if(divisors[i] == divisors[j]){
					if(original[i]>original[j]) {
						tmp = divisors[i];
						divisors[i] = divisors[j];
						divisors[j] = tmp;
						
						tmp = original[i];
						original[i] = original[j];
						original[j] = tmp;
					}
				}
			}
		}
			
		// Print sorted
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] + " ");
		}
	}

}
