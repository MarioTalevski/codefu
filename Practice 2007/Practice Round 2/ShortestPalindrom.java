
public class ShortestPalindrom {
	
	public static void main(String[] args) {
		String[] words = {"aba", "abba", "xxxx"};
		String tmp,result = "";
		int palindrom = 0;
		
		for(int i=0; i<words.length; i++) {
			tmp = words[i];
			for(int x=0,y=tmp.length()-1; x<tmp.length(); x++,y--) {
				if(tmp.charAt(x) == tmp.charAt(y)) {
					palindrom++;
				}
			}
			if(palindrom == tmp.length()) {
				result = tmp;
			}
			palindrom = 0;
		}
		
		for(int i=0; i<words.length; i++) {
			tmp = words[i];
			for(int x=0,y=tmp.length()-1; x<tmp.length(); x++,y--) {
				if(tmp.charAt(x) == tmp.charAt(y)) {
					palindrom++;
				}
			}
			if(palindrom == tmp.length()) {
				if(result.length() > tmp.length()) {
					result = tmp;
				}
			}
			palindrom = 0;
		}
		
		
		System.out.println(result);
		
	}

}
