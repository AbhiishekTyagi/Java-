//Ineterface extends by another interface
import java.io.*;
interface d
{
	//All this abstract methods 
	public abstract void G();
	public abstract void F(); 
    public abstract void B();
}
interface G extends d
{
	public default void ch()
	{
		System.out.println("Checking is Done !");
	}
	public static void v()
	{
		System.out.println("V for Voting!");
	}
	
}
class C implements G
{
	public  void G()
	{
		System.out.println("G for Ganga Mayaa!");
	}
	public  void F()
	{
		System.out.println("F for Flower!");
	}
	public void B()
	{
		System.out.println("B for Ball");
	}
	public static void main(String ... args)
	{
		C c=new C();
		c.G();
		c.F();
		c.B();
		c.ch();
        G.v();
	}
}