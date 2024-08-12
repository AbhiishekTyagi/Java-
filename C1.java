//Solution of Deadly Diamond Problem using interface 
import java.io.*;
interface S
{
	void fun();
}
interface G
{
	void fun();
}
class C1 implements S,G
{
	public void  fun()
	{
		System.out.println("I am IN Fun");
	}
	public static void main(String []args)
     {
     	C1 c=new C1();
     	c.fun();
     }
}
