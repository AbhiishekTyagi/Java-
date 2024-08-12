//Number is odd and even 
public class EvenOdd
{
	public static void main(String [] args)
	{
		int num=0;
		System.out.println("Enter the number want you check is odd or even");
		num=Integer.parseInt(args[0]);
		if(num%2==0)
		 System.out.println("Number is even="+num);
		else
		 System.out.println("Number is odd="+num);		
	}
}