package module5._2parameters;

/*
 * Exercise: Add a method called calculateShipping that has
 * one parameter. Then, use this method to replace the redundant
 * code within the main method.
 */
public class E05ShippingCostCalculator {
	
	public static void calculateShipping(double weight) {
		double cost;
		if (weight < 15.0) {
			cost = 9.95;
		} else {
			cost = 12.95;
		}
		System.out.println(cost);
	}

	public static void main(String[] args) {

		calculateShipping(22.0);
		calculateShipping(10.0);
		calculateShipping(12.0);
	}
}
