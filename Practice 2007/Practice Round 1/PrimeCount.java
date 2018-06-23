
public class PrimeCount {
	
	public static void main(String[] args) {
		int start = 1, end = 11;
		int cnt = 0, result = 0;
		
		for(int i=start; i<end+1; i++) {
			for(int j=1; j<i+1; j++) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			if(cnt <= 2) {
				result++;
			}
			cnt = 0;
		}
		
		if(end == 1) {
			result = 1;
		}
		
		System.out.println(result);
	}

}
