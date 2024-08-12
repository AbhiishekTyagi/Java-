//Deadly Diamond Problem in java 
import java.io.*;
class A
{
	void display()
	{
		System.out.println("A display");
	}
}
class B extends A
{
	//@override 
	void display()
	{
		System.out.println("B display");
	}
}
class C extends A
{
   //@override
   void display()
   {
   	System.out.println("C display");
   }
}
//Not allowded in java 
class F extends B,C
{
   public static void main(String ... args)
   {
   	 F d=new F();
   	//Create ambiguity which one class display method call
   	d.display();
   }
}
