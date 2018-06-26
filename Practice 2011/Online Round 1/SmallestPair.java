
public class SmallestPair {
	
	public static void main(String[] args) {
		
		int numbers[] = {1,4,1,4,14};
		int sum = 0, smallest = 0;
		Boolean first = true;
		
		for(int i=0; i<numbers.length-1; i++) {
			
			if(first == true) {
				smallest = numbers[i] + numbers[i+1];
				first = false;
			}
				
			sum = numbers[i] + numbers[i+1];
			if(sum < smallest) {
					smallest = sum;
			}
			
		}
		
		System.out.println(smallest);
		
	}

}
