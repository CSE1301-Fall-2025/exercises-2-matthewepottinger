package module5._2parameters;

/*
 * Exercise: Use the debugger to examine the values of x
 * and y as you step through the code. Does the value of y
 * change when the value of x changes? Why or why not?
 */
public class E04CallByValue {
	
	public static void square(int x) {
		x = x * x;
		System.out.println(x);
	}

	public static void main(String[] args) {
		int y = 5;
		square(y);
		System.out.println(y);
	}
}
