package Assignment4_Session2;  // Package with a class and a main method

import java.util.*; /* Importing all classes from Java.util package. We will use Scanner class from this util package
to receive input from the user*/ 

public class Grade { // Class declared with main method for calculation of grade based on marks

	public static void main(String[] args) {  // Main function which is static which will be executed first
		
		int mark1, mark2, mark3, totalMarks, AvgMark;  // variables declared for user inputs
		
		Scanner sc = new Scanner(System.in); // scanner class - variable is declared.
		
		System.out.println("Enter the marks for each subject out of 100");
		System.out.println("*******************************************");
		
		System.out.println("Enter Marks for Physics : ");   // Marks will be received from user for each of the subject mentioned below
		mark1 = sc.nextInt();                               // values will be assigned to respective variables      
		System.out.println("Enter Marks for Chemistry : ");
		mark2 = sc.nextInt();
		System.out.println("Enter Marks for Maths : ");
		mark3 = sc.nextInt();
	
		totalMarks = mark1+mark2+mark3;  // total marks calculated by adding three individual marks as entered by user.
		AvgMark = totalMarks/3; // Average is calculated based on the number of subjects given.
		
		if(AvgMark > 70)                      // checking condition using relational operator and if statement to determine the grades.
		{
			System.out.println("Grade is A");
		}
		else if(AvgMark>=61 && AvgMark<=70)
		{
			System.out.println("Grade is B");
		}
		else if(AvgMark<=60)
		{
			System.out.println("Grade is C");
		}
		

	}

}
