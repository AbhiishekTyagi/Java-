//Method Overloading in java
import java.util.Scanner; 
class Area
{
	public static void main(String ... args)
	{
		double pi=3.1416;
		double area;
		int radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius=sc.nextInt();
        area=pi*radius*radius;
        System.out.println("Area of Circle="+area);
	} 
}