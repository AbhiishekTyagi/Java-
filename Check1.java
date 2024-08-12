//Default implementation provide in the interface 
interface In1
{
	public static final int n=12;
	static void F()
	{
		System.out.println("F");
	}
	abstract void print();
   default void display()
   {
   	 System.out.println("Default Implementation");
   } 
}
class Check1 implements In1
{
	public void display()
	{
		System.out.println("Class Implementation");
	}
	public void print()
	{
      System.out.println("Printing in Interface");
	}
public static void main(String ... args)
{
	 Check1 ch=new Check1();
	 ch.print();
	 ch.display();
	 In1.F();
	 System.out.println("No="+ch.n);  	
}
}