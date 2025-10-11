package module5._3return;

/*
 * Exercise: Write a method randomNumberInRange() that takes in two
 * integer parameters, min and max, and returns a random integer value
 * from within that range (inclusive). Test your method by calling it
 * from the main method.
 */
public class E04RandomNumberInRange {
	public static int randomNumberInRange(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

	public static void main(String args[]) {
		System.out.println(randomNumberInRange(2,18));
	}
}
