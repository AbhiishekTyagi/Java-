//Abstract class in java 
abstract class Sunstar
{
	//Non-abstract method(Method with body)
	void check()
	{
      System.out.println("Checking Perform");
	}
	abstract void print();
}
class Child extends Sunstar
{
	void print()
	{
		System.out.println("Printing is perform");
	}
	public static void main(String ...args)
	{
		Sunstar sr=new Sunstar();
		sr.check();
	}
}