package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.8, .2, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(.5, .1, .005);
		
		//Draw a larger green point someplace else
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(.2, .8, .01);
		
		//Draw an unfilled red triangle somewhere
		StdDraw.setPenColor(Color.RED);
		double[] x = {0.1, 0.2, 0.3};
		double[] y = {0.2, 0.3, 0.2};
		StdDraw.polygon(x, y);
		
		//Draw a filled yellow circle somewhere
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.8, .8, .1);

		//Draw a filled blue rectangle somewhere
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.1, .5, 0.05,0.1);

	}
}
