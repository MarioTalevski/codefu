
public class Fibonacci {
	
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println(fib(10));
		
	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
	    if(n == 1) {
	        return 1;
	    } else {
	        return fib(n-1)+fib(n-2);
	    }
	}

}
