package module5._5exercises;

/*
The methods you should write:

 * A method that takes in a ``String`` and returns that string concatenated with itself. This one is completed for you.

 * A method that takes in a ``String`` and an ``int n``, and returns n copies of the string concatenated together

 * Now go back and rewrite your first method by having it call the second one.

 * Take a look at Java�s `split method, that splits a ``String`` into an array containing the parts split by the specified regular expression.

	Here, assume the regular expression is simply " ", so that the input String is split into words.

 * Write a method ``join(String[] array, String joiner)`` that is the inverse of split: it returns a single String with a copy of the joiner string between each part.

 * Rewrite your second method in terms of this last one. To do this, create an array that has n copies of a given String, and then use your join method to concatenate them.

	Think about the string you want to appear between the copies, so that it appears the strings were concatenated together as before.
 */

public class StringMethods {

	public static String selfConcat(String s) {
		return nStrings(s, 2);
	}

	public static String nStrings(String s, int n) {
		String nS[] = new String[n];
		for (int i = 0; i < nS.length; i++) {
			nS[i] = s;
		}
		return join(nS, "");
	}
	public static String join(String array[], String joiner) {
		String sentence = "";
		for (int i = 0; i < array.length; i++) {
			sentence = sentence + array[i] + joiner;
		}
		return sentence;
	}

	public static void main(String[] args) {
		// Testing the methods
		//System.out.println(selfConcat("echo"));
		System.out.println(nStrings("echo", 3));
		//String words[] = {"Pretty", "Purple", "People", "Eaters"};
		//System.out.println(join(words," "));


	}
}
