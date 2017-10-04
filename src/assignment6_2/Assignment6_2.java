/**
 * 
 */
package assignment6_2;

import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
class NegativeAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAgeException(String age) {
		// Call constructor of parent Exception
		super(age);
	}
}

public class Assignment6_2 {
	private static Scanner ageInput;	//declaring static scanner variable.

	void ageCheck(int age) throws NegativeAgeException { // class to validate the age
		if (age < 0) {
			throw new NegativeAgeException("Nagative Age Exception"); // custom message if the age is negative
		}
	}

	public static void main(String args[]) {
		Assignment6_2 obj = new Assignment6_2();
		ageInput = new Scanner(System.in);	// Scanner class to get input
		try {
			System.out.println("Enter the Age: \n");
			int age = ageInput.nextInt();	//Get the input from user
			obj.ageCheck(age);		//calls the Age validate method
			System.out.println("Age is Positive");
		} catch (NegativeAgeException ex) {
			System.out.println(ex.getMessage());		//throws custom exception
		}
	}
}