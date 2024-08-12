// Private method in interface that was introduce in JDK 9 onwards.
import java.io.*;
interface P
{
	private  abstract void fun();
    default void check()
    {
     checker();
     System.out.println("Checking is Perform");
    }
    public static void farm()
    {
      checker();
      System.out.println("Farming");
    } 
    private static  void checker()
    {
    	System.out.println("Used in only in interface");
    }
}
class D implements P
{
	public void fun()
     {
     	System.out.println("Funn is fun");
     }
     public static void main(String ...args)
     {
     	D d=new D();
     	d.fun();
     	d.check();
     	P.farm();
     }
}