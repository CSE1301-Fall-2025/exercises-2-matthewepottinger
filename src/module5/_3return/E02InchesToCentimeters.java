package module5._3return;

/*
 * Exercise: Update this code so that instead of printing
 * the centimeters value in the inchesToCentimeters() method,
 * it returns the centimeters value and prints it from the
 * main() method.
 */
public class E02InchesToCentimeters {
	public static double inchesToCentimeters(double inches) {
		return inches * 2.54;
	}

	public static void main(String[] args) {
		double centimeters;
		centimeters = inchesToCentimeters(10);
		System.out.println(centimeters);
		centimeters = inchesToCentimeters(12.5);
		System.out.println(centimeters);
	}
}
