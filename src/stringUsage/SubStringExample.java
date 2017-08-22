/*
 * program to find a substring in a String by using an inbuilt method of String class.
 */
package stringUsage;

public class SubStringExample {

	public static void main(String[] args) {
		String stringValue = "Hoping to get 100 marks!"; // declaring string variable
		System.out.println("Main string : "+ stringValue);
		String getSubString1 = stringValue.substring(13, 24); // To fetch 100 marks! from stringValue.Returns a string
																// that is a substring of this string. The substring
																// begins
																// at the specified beginIndex and extends to the
																// character
																// at index endIndex - 1.
		System.out.println("Substring:" + getSubString1);

		String getSubString2 = stringValue.substring(13);// Alernatively used.Returns a string that is a substring of
															// this string. The substring begins with the character at
															// the specified index and extends to the end of this
															// string.
		System.out.println("substring :" + getSubString2);
	}

}
