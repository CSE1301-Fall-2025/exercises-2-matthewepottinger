package module6._2exercises;
import java.util.Scanner;

public class Sum {
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum (n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What number are you summing?");
		int n = scan.nextInt();
		System.out.println("The sum of " + n + " is " + sum(n));
	}
}
