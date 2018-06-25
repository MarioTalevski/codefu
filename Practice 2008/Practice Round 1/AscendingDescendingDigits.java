
public class AscendingDescendingDigits {
	
	public static void main(String[] args) {
	
		int start = 10, end = 100;
		int checkAsc = 0, checkDesc = 0, result = 0;
		String tmp;
		
		for(Integer i = start; i < end; i++) {
			tmp = i.toString();
			for(int j=0;j<tmp.length()-1;j++) {
				if((tmp.charAt(j)-'0')+1 == (tmp.charAt(j+1)-'0')) {
					checkAsc++;
				}
				if((tmp.charAt(j)-'0')-1 == (tmp.charAt(j+1)-'0')) {
					checkDesc++;
				}
				
			}
			if(checkAsc == tmp.length()-1) {
				result++;
			}
			if(checkDesc == tmp.length()-1) {
				result++;
			}
			checkDesc = 0;
			checkAsc = 0;
		}
		
		System.out.println(result);	
		
	}

}
