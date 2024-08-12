//Print pattern in java 
import java.util.Scanner;
public class Pattern2
{
	public static  void print(int n)
	{
		//Outer loop for rows
		for(int i=1;i<=n;i++)
		{
			//Loop for printing space 
           for(int j=1;j<=n-i;j++)
           {
             
             System.out.print(" ");
           } 
           //Loop for printing *
           for(int j=1;j<=(2*i)-1;j++)
           {
           	  System.out.print("* ");
           }

           //For changing the line 
           System.out.println();
		}
	}
	//Main method
	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows want you print in the pattern");
        int n=sc.nextInt();
        print(n);
	} 
} 