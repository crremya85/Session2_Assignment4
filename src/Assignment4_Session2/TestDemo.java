package Assignment4_Session2; // This Java file is inside Package named Assignment4_Session2 inside src folder

import java.util.*; /* Importing all classes from Java.util package. We will use Scanner class from this util package
                         to receive input from the user*/ 
public class TestDemo {  // Declaration of class which contains Main Function.

	public static void main(String[] args) { // Main function declaration. It is static and program execution starts from Main
		
		int inputUser; // Variable created for receiving user input
		System.out.println("Enter the integer number"); // System class with out object prompts to the user to receive input
		
		Scanner sc=new Scanner(System.in); // creating object for scanner class.
		
		inputUser = sc.nextInt(); // nextInt for integer input from user / input initialized to the variable through scanner object
		
		if(inputUser==0) // Checking condition for user input 0
		{
			System.out.print("You have entered Zero and its ASCII value is" );  // Printing the value entered in the form of text as part of if loop
		}
		else 
			if(inputUser>0) // checking if user input is greater than '0'
				{
				System.out.print("You have entered a Positive value and its ASCII value is"); // if condition is true it will display the print statement
				}
			else
			{
				System.out.print("You have entered a Negative value and its ASCII value is"); //if condition is false it will display the print statement
			}
		
		char inputValue = Integer.toString(inputUser).charAt(0); // Declared a char variable to store the type casted value of user input to get the ASCII value       
		System.out.println(" :  " + (int)inputValue);
	}
	
		
		
		
	}


