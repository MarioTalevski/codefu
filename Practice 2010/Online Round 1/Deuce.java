
public class Deuce {
	
	public static void main(String[] args) {
		
		String cards = "7S3S9DKS4S8HADJH5D7CQC6HJD4C3H5C8C7D2S1D3C1S8S4D5HKHAH9HAS9S3DAC6C7H4H2H5S2DKCJS8DKD1CQDQHJCQS1H2C6S9C6D";
		int numPlayers = 6;
		int cnt = 0, result = 0;
		
		for(int i=0; i<cards.length();i = i + (numPlayers*2)) {
			for(int j = i; j<i+(numPlayers*2) && j < cards.length(); j=j+2) {
				cnt++;
				if(cards.charAt(j) == '2' && cards.charAt(j+1) == 'C') {
					result = cnt;
				}

			}
			cnt = 0;
		}
		
		int last = cards.length()-1;
		
		while(last > cards.length()- (numPlayers+1)) {
			if(cards.charAt(last) == 'C' && cards.charAt(last-1) == '2') {
				result = 0;
			}
			
			last = last -2;			
		}
		
		System.out.println(result-1);
	}

}
