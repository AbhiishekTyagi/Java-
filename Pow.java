//Hierarchical Inheritance in Java means one class serve as superclass to one or more class.
class A
{
	public void printA()
	{
	  System.out.println("Class A");
	}
}
class B extends A
{
   public void print_B()
   {
   	System.out.println("Class B");
   } 
}
class C extends A
{
	public void print_C()
	{
		System.out.println("Class C");
	}
}
class D extends A
{
	public void print_D()
	{
		System.out.println("Class D");
	}
}
class Pow
{
	public static void main(String ...args)
	{
		B b=new B();
		b.printA();
		b.print_B();
		C c=new C();
		c.printA();
		c.print_C();
		D d=new D();
		d.printA();
		d.print_D();
	}
}