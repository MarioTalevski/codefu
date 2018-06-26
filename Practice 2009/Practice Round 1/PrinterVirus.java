
public class PrinterVirus {
	
	public static void main(String[] args) {
		
		String text = "Printer with virus";
		char[] partOne = new char[text.length()/3];
		char[] partTwo = new char[text.length()/3];
		char[] partThree = new char[text.length()/3];
		char[] resultChar = new char[text.length()];
		int part = text.length() / 3, x =0,y = 0, z=0, pom = 0;
		
		for(int i=(text.length()/3)-1; i > -1; i--) {
			partOne[x] = text.charAt(i);
			resultChar[pom] = partOne[x];
			x++;
			pom++;
		}
		
		
		for(int i=((text.length()/3)*2)-1; i > x-1; i--) {
			partTwo[y] = text.charAt(i);
			resultChar[pom] = partTwo[y];
			y++;
			pom++;
		}
		
		for(int i=text.length()-1; i > x+y-1; i--) {
			partThree[z] = text.charAt(i);
			resultChar[pom] = partThree[z];
			z++;
			pom++;
		}
		
		String result = new String(resultChar);
		
		System.out.print(result);
		
	}

}
