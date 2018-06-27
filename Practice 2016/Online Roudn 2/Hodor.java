
public class Hodor {
	
	public static void main(String[] args) {
		String hodor = "HODOR Hodor . ah hahaha Hodor ... Hodor uhh HODOR HODOR HODOR HODOR aaargh ... hodor hodor HODOR Hodor uhh";
		hodor = hodor.toLowerCase();
		int cnt = 0;
		
		for(int i=0; i<hodor.length()-1; i++) {
			if(hodor.charAt(i) == 'h' && hodor.charAt(i+1) == 'o' && hodor.charAt(i+2)== 'd' && hodor.charAt(i+3) == 'o' && hodor.charAt(i+4) == 'r' && i < hodor.length()-1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
