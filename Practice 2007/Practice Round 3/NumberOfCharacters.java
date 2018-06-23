
public class NumberOfCharacters {
	public static void main(String[] args) {
		String inString = "akjqwheasdasdqweasdeasdasdqweqweqqqqqqqalksjdaeoi";
		char[] input = new char[inString.length()];
		int cnt = 0;
		
		for(int i=0;i<inString.length();i++) {
			input[i] = inString.charAt(i);
		}
		
		for(int i=0; i<inString.length(); i++) {
			if(input[i] != '0') {
				for(int j=i+1; j<inString.length(); j++) {
					if(input[i] == input[j]) {
						input[j] = '0';
					}
				}
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
