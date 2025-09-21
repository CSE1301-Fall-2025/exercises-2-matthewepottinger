package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class E01Stats {

	/*
	 * Exercise: The below code reads in a series of doubles from a file and prints them.
	 * Modify this code to find the maximum, minimum, average, and count of the values
	 * read in from the file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise
		int doubCount = 0;
		while(in.hasNextDouble()) {
			in.nextDouble();
			doubCount++;
		}
		System.out.println("There are " + doubCount + " doubles being analyzed.");
		double fileSortArray[] = new double[doubCount];
		in = new Scanner(f);
		int i = 0;
		while(in.hasNextDouble()) {
			fileSortArray[i] = in.nextDouble();
			i++;
		}
		double max = 0.0;
		for (int index = 0; index < fileSortArray.length; index++) {
			//System.out.println(fileSortArray[index]);
			if (fileSortArray[index] > max) {
				max = fileSortArray[index];
			}
		}
		System.out.println("The maximum value is " + max + ".");
		double min = fileSortArray[0];
		for (double minCandidate : fileSortArray) {
			if (minCandidate < min) {
				min = minCandidate;
			}
		}
		System.out.println("The minimum value is " + min + ".");

		double sum = 0.0;
		for (double sumAddition : fileSortArray) {
			sum = sum + sumAddition;
		}
		double Average = sum / doubCount;
		System.out.println("The average value is " + Average + ".");
	}
}
