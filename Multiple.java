//Multiple Inheritance in java (Through only interface)
import java.io.*;
import java.lang.*;
interface one
{
	//Only abstract method
	public void print();
}
interface two
 {
	public void print();
  }
class Tect implements one,two
{
	public void printing()
	{
		System.out.println("Class");
	}
   public void print()
    {
    	System.out.println("Abstract METHODS");
    }
}
class Multiple
{
	public static void main(String... args)
	{
		Tect t=new Tect();
		t.print();
		t.printing();	
	}
}