package Assignment1_Session2;
import java.util.Scanner;
/**
 * Class created to understand the functionality of Conditional Relational Operator
 **/
public class RelationalOpr {

	/**
	 * class contains relational operators to determine the biggest among three numbers given by user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Enter Number 1 :");
		n1= sc.nextInt();
		System.out.println("Enter Number 2 :");
		n2= sc.nextInt();
		System.out.println("Enter Number 3 :");
		n3= sc.nextInt();
		
		System.out.println("NUmber 1 is Biggest : " + ((n1>n2) && (n1>n3)) );
		System.out.println("NUmber 2 is Biggest : " + ((n2>n1) && (n2>n3)) );
		System.out.println("NUmber 3 is Biggest : " + ((n3>n2) && (n3>n1)) );
		System.out.println("All are Equal : " + (((n1==n2) && (n1==n3))||((n2==n1) && (n2==n3)) || ((n3==n1) && (n3==n2))) );
		System.out.println("NUmber 1 is Bigger than Number 2 and Number 3 : " + ((((n1>n2) && (n1>n3))) && (n2==n3)) );
		System.out.println("NUmber 2 is Bigger than Number 1 and Number 3 : " + ((((n2>n1) && (n2>n3))) && (n1==n3)) );
		System.out.println("NUmber 3 is Bigger than Number 1 and Number 2 : " + ((((n3>n1) && (n3>n2))) && (n1==n2)) );
		System.out.println("Number 1 and Number 2 are Bigger than Number 3 : " + ((n1==n2) && (n1>n3)) );
		System.out.println("NUmber 2 is Bigger than Number 1 and Number 3 : " + ((n1==n3) && (n1>n2)) );
		System.out.println("NUmber 3 is Bigger than Number 1 and Number 2 : " + ((n2==n3) && (n2>n1)) );
	}

}
     