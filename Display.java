//Final keyword in java 
class Display
{
	 int num=18;
	final void Num()
	 {
	   System.out.println("RadhaputraAbhishek");
	    }
}
class Printing extends Display
{
	void num()
	{
		System.out.println("KrishnaPutraAbhishek");
	}
	public static void main(String ... args)
	{
		Printing pr=new Printing();
		pr.num();
	}
}

