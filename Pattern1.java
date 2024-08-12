//Print pattern in java 
import java.util.Scanner;
public class Pattern1
{
	public static  void print(int n)
	{
		//Outer loop for rows
		int i=0;
		for(;i<n;i++)
		{
			//Loop for printing space 
           for(int j=0;j<(n-i);j++)
           {
             
             System.out.print(" ");
           } 
           //Loop for printing *
           for(int k=0;k<=i;k++)
           {
           	  System.out.print("*");
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
       Pattern1.print(n);
	}
} 