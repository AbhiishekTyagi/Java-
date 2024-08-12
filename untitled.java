//Interface in java 
interface In1
{
	int f=12;
	void Print()
	{
		System.out.println("Printing");
	}
}
class Im implements In1
{
	void Print()
	{
      System.out.println("Printing In class");
	}
	public static void main(String ... args)
	{
       Im i=new Im();
       i.Print();
	}
}