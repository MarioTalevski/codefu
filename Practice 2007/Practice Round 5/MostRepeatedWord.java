
public class MostRepeatedWord {
	
	public static void main (String[] args) {
		String sentence= "ab ba abba aa";
		sentence = sentence.toLowerCase();
		String[] words = sentence.split(" ");
		String result = words[0];
		int[] counters = new int[words.length];
		
		int cnt = 0, max = 0;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					cnt++;
					if(cnt > max) {
						max = cnt;
						result = words[i];
					}
				}
			}
			counters[i] = cnt;
			cnt = 0;
		}
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1; j<words.length; j++) {
				if(counters[i] == counters[j] && counters[i] != 0 && counters[j] != 0 && counters[i] == max && counters[j] == max) {
					if(words[i].compareTo(words[j]) > 0) {
						result = words[j];
					}
				}
			}
		}
	
		if(max == 0) {
			for(int i=0; i<words.length;i++) {
				for(int j=0; j<words.length;j++) {
					if(words[i].compareTo(words[j]) < 0) {
						result = words[i];
					}
				}
			}
		}
		
		System.out.println(result);
	}

}
