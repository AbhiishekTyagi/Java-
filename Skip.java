//Scanner skipping the nextLine() method after the nextInt() method
import java.util.Scanner;
class Skip
{
	public static void main(String ... args)
	{
		//Making the object of Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		//23\n generate basically from hitting enter button 
		int ag=sc.nextInt();
		// Only 23 is consumed by nextInt() \n 	is still in the buffer memory  
		sc.nextLine();
		System.out.println("Enter your Nice Name pllzz");
		String name=sc.nextLine(); //here nextLine() read this \n from buffer memory 
		System.out.println("Your Age is="+ag);
		System.out.println("Your Name is="+name);
	}
}