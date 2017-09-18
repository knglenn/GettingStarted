//-------------------------------------------------
//  #Getting Started
// 	#Kevin Glenn
// 
//	Description: A simple Java program with a few inputs
//-------------------------------------------------

// Tells the compiler to include the Scanner class. This
// class can read input form the keyboard.
import java.util.Scanner;

// The class declaration.
// All java programs have a class with a main method
public class GettingStarted
{
	//The main method of the class. Program execution starts here.
	public static void main(String[] args)
	{
		// Declare Variables.
		// Variables are storage locations in the computer. In Java
		// a variable holds a specific type of data such as String
		// or double.
		String name;	// a String holds a list of letter
		double age;		// a double holds a number with a decimal part
		String major;	// a second String to hold your major

		// Print your name
		System.out.println("GettingStarted by <Kevin Glenn>\n");

		// Create a scanner to read input from the keyboard
		Scanner scan = new Scanner(System.in);

		// Print out a "prompt" telling the user that they need
		// to type in their name.
		System.out.println("What is your name?");

		// Wait for the user to type a line of input and then 
		// set the variable "name" to have this value.
		name = scan.nextLine();

		// Ask the user for their major
		System.out.println("What is your major?");
		major = scan.nextLine();

		// Prompt the user for their age, and read the response as a double
		// (double is short for double-precision floating point number.)
		System.out.println("How old are you?");
		age = scan.nextDouble();

		// Print the output
		System.out.print("\n" + name + " is majoring in " + major + ",");
		System.out.print(" and is ");
		System.out.println(age + " years old.");

	} // End of main method
} // End of GettingStarted class