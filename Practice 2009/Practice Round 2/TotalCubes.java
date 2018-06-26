
public class TotalCubes {
	
	public static void main(String[] args) {
		
		int A = 100, B = 1000;
		int result = 0;
		
		for(int i=1; i<1000;i++) {
			if((i*i*i)>=A && (i*i*i)<=B) {
				result++;
			}
		}
		
		System.out.print(result);
	}

}
