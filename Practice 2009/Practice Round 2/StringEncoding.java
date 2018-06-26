public class StringEncoding {
	
	public static void main(String[] args) {
		String s = "onetwothree";
		
		String[] c = new String[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			c[i] = "" + s.charAt(i);
		}
		
		int k=0;
		Integer cnt = 0;
		for(int i=0; i<s.length() - 2; i++) {
			if(c[i].equals(c[i+1] )&& c[i] != "") {
				k = i;
				while(c[k].equals(c[k+1]) && k < s.length()-2) {
					cnt++;
					k++;
				}
				if(c[k].equals(c[k-1]) && k==s.length()-2) {
					c[k] = "";
				}
				for(int j = i+1; j < i+cnt+1; j++) {
					c[j] = "";
				}
				cnt++;
				c[i+1] = cnt.toString();
				cnt = 0;
			}
		}
		

		StringBuilder builder = new StringBuilder();
		for(String p : c) {
		    builder.append(p);
		}
		
		String result = builder.toString();
		
		if(result.charAt(result.length()-1) == result.charAt(result.length()-2)) {
			result = result.substring(0, result.length() - 1) + '2';
		}
		
		System.out.print(result);
	
	}

}
