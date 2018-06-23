
public class DifferentDigits {
	
	public static void main(String[] args) {
		int start = 120 , end = 130, duplicates = 0;
		String tmp;

		for(Integer i=start; i<end+1; i++) {
			tmp = i.toString();
			outerloop:
			for(int x=0; x<tmp.length(); x++) {
				for(int y=x+1; y<tmp.length(); y++) {
					if(tmp.charAt(x) == tmp.charAt(y)) {
						duplicates++;
						break outerloop;
					}
				}
			}
		}
		
		int result = end - start + 1 - duplicates;
		
		System.out.println(result);
		
	}
	
}
	


