//Practice for abstract class
abstract class Stone
{
	  static int data=12;
	 static int square(int n)
	 {
	 	 return n*n;
	 }
}
class Child extends Stone
{
	void print()
	{
		System.out.println("Data="+data);
	}
}
class StaticAbstract
{
	public static void main(String ...args)
	{
		System.out.println("Square="+Stone.square(Stone.data));
		Child ch=new Child();
		ch.print();
	}
}