//Reading the character in java
import java.util.Scanner;
class Character
{
	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name pllzz");
		String name=sc.nextLine();
		System.out.println("Enter your Gender");
		char ge=sc.next().charAt(0);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		System.out.println("Your Name="+name);
		System.out.println("Your Gender="+ge);
		System.out.println("Your Age="+age);
	}
}