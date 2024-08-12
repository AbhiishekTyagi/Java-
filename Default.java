//Default implementation provide in the interface 
interface In1
{
	public static final int n=12;
	abstract void print();
   default void display()
   {
   	 System.out.println("Default Implementation");
   } 
}
class Check implements In1
{
	public void print()
	{
      System.out.println("Printing in Interface");
	}
public static void main(String ... args)
{
	 Check ch=new Check();
	 ch.print();
	 ch.display();
	 System.out.println("No="+ch.n);  	
}
}