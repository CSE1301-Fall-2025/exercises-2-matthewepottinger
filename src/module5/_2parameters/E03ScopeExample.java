package module5._2parameters;

/*
 * Use the debugger to step through this example. Can you see
 * the "inches" and "centimeters" variables from the main method?
 */
public class E03ScopeExample {
	
	public static void inchesToCentimeters(double inches) {
		double centimeters = inches * 2.54;
		System.out.println(inches + "-->" + centimeters);
	}

	public static void main(String[] args) {
		inchesToCentimeters(10);
		inchesToCentimeters(15.7);
	}

}
