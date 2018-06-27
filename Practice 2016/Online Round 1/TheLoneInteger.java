
public class TheLoneInteger {
	
	public static void main(String[] args) {
		int[] a = {1,2,1};
		int cnt = 0, result =0;
		
		for(int i=0; i<a.length; i++) {
			for(int j= 0; j<a.length; j++) {
				if(a[i] == a[j]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				result = a[i];
			}
			cnt = 0;
		}
		
		System.out.println(result);
	}

}
