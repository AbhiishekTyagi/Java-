//Java Program to check the enter integer number is even or odd
import java.util.*;
class EvenChecker
{
	public static void main(String[] args)
	{
      
      int a=Integer.valueOf(args[0]);
      if(a%2==0)
      {
      	System.out.println("Number is Even="+a);
      }
       else
       {
       	System.out.println("Number is odd=" +a);
       }
	}
}