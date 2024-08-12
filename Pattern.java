// STAR pattern Practices in Java 
import java.util.*;
public class Pattern
{
	public static void printPattern(int n)
	{
		//outer loop for handle row 
		for(int i=0;i<n;i++)
		{
			//Inner loop for printing the *
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			//For Space 
			System.out.println();

		}
	}
	//Main Method
	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows want you print in the pattern");
        int n=sc.nextInt();
		Pattern.printPattern(n);
	} 
}