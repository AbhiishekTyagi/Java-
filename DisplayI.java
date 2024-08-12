//Interface in Java 
interface In1
{
	public static final int a=12;
	public abstract void display();
}
//Class that implements the interface 
class DisplayI implements In1
{
	int no=12;
	public void display()
	{
		System.out.println("Interface Used for  100% Abstraction");
	}
	void square()
	{
		System.out.println("Square="+no*no);
	}
//Main method
public static void main(String ... args)
{
	DisplayI ds=new DisplayI();
	ds.display(); 
    ds.square();
    System.out.println("Value of a="+ds.a);
 }
} 
