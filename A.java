//Interface in java 
interface In1
{
	 public static final int f=12;
	 static void Print()
	 {
        System.out.println("Printing In Interface");
	 }
}
class A implements In1
{
  public void Print()
  {
  	System.out.println("Printing in class");
  }
	public static void main(String ... args)
	{
       A i=new A();
       i.Print();
       i.f=13;
       System.out.println("A="+i.f);
	}
}