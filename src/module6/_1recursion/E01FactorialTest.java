package module6._1recursion;

/*
 * Exercise: Use the debugger to examine how this recursive method works.
 * Add examples for the factorial of 4 and the factorial of 1.
 */
public class E01FactorialTest {

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	//Loop version of the same thing
	public static int factorialLoop(int n) {
		int result = 1;
		while(n != 0) {
			result = result * n;
			n--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//System.out.println(factorial(4));
		System.out.println(factorialLoop(4));
	}
}
