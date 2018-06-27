
public class MobileOperators {
	
	public static void main(String[] args) {
		String[] numbers = {"076683-993", "077706-471"};
		String[] A = {"070","071","072"};
		String[] B = {"075","076"};
		String[] C = {"077","078"};
		String result = "Operator A";
		int cntA = 0 , cntB = 0 , cntC= 0, resultA =0, resultB = 0, resultC =0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length(); j++) {
				for(int k=0; k<A.length; k++) {
					for(int x=0; x<3; x++) {
						if(A[k].charAt(x) == numbers[i].charAt(x)) {
							cntA++;
						}
					}
					if(cntA == 3) {
						resultA++;
					}
					cntA = 0;
				}
				for(int k =0; k<B.length; k++) {
					for(int x=0; x<3; x++) {
						if(B[k].charAt(x) == numbers[i].charAt(x)) {
							cntB++;
						}
					}
					if(cntB == 3) {
						resultB++;
					}
					cntB =0;
				}
				cntB = 0;
				for(int k=0; k<C.length; k++) {
					for(int x=0; x<3; x++) {
						if(C[k].charAt(x) == numbers[i].charAt(x)) {
							cntC++;
						}
					}	
					if(cntC == 3) {
						resultC++;
					}
					cntC = 0;
				}

			}
		}
		
		if(resultA > resultB && resultA >resultC && resultA != resultB && resultA != resultC) {
			result = "Operator A";
		}
		if(resultB > resultA && resultB > resultC && resultB != resultA && resultB != resultC) {
			result = "Operator B";
		}
		if(resultC > resultA && resultC > resultB && resultC != resultA && resultC != resultB) {
			result = "Operator C";
		}
		
		if(resultA == resultB && resultA > resultC) {
			result = "Operator A";
		}
		if(resultA == resultC && resultA > resultB) {
			result = "Operator A";
		}
		if(resultB == resultA && resultB > resultC) {
			result = "Operator A";
		}
		if(resultB == resultC && resultB > resultA) {
			result = "Operator B";
		}
		if(resultC == resultA && resultC > resultB) {
			result = "Operator A";			
		}
		if(resultC == resultB && resultC > resultA) {
			result = "Operator B";
		}
		
		System.out.println(result);
	}

}
