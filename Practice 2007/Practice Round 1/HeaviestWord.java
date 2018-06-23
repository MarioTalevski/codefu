

public class HeaviestWord {
	
	public static void main(String[] args) {
		
		String[] words = {"dddd", "cccc", "xxxx", "bbbb"};
		String vocalCharacters = "aeiouy";
		int points = 0, max = 0;
		String result = words[0];
		
		for(int i=0; i<words.length; i++) {
			String tmp = words[i];
			for(int j=0; j<tmp.length(); j++) {
				for(int k=0; k<vocalCharacters.length(); k++) {					
					if(tmp.charAt(j) == vocalCharacters.charAt(k)) {
						points++;
					}
				}
			}
			if(points == max) {
				if(result.compareTo(tmp) > 0) {
					result = tmp;
				}
			}
			if(points > max) {
				max = points;
				result = tmp;
			}
			points =0;
			
		}
		
		System.out.println(result);
	}

}
