package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E02KeyboardDemo {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		
		//Wait until the user presses a key, checking periodically
		while(!StdDraw.hasNextKeyTyped()) {
			StdDraw.pause(100);
		}
		
		//What character was pressed? Provide a response
		char got = StdDraw.nextKeyTyped();
		if(got == 'y') {
			System.out.println("Yes");
		} else if(got == 'n') {
			System.out.println("No");
		} else {
			System.out.println("What?");
		}
	}
	
}
