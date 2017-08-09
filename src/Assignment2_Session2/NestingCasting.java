package Assignment2_Session2;
/**
 * Class is created to print a diamond pattern using Nesting *
 */
public class NestingCasting {

	/**
	 * Main method contains two nested loops to print the diamond pattern
	 */
	
	public static void main(String[] args) {
		/**
		 * Prints the upper triangle
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3-i;j++) { System.out.print(" "); 	}
			for(int j=1;j<=i*2-1;j++)
			{
				if(j%2==0) {  System.out.print("b"); }
				else if((i==3) && (j==3)) {   System.out.print("c"); }
				else { System.out.print("a"); }
			}
			System.out.println();
		}
		/**
		 * Prints the Lower triangle
		 */
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j>=2-i;j--) { System.out.print(" "); }
			for(int j=3;j>=i*2-1;j--) {
				if(j%2==0) { System.out.print("b"); }
				else { System.out.print("a"); }	
			}
			System.out.println();	
		}
	}
}
