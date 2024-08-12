//Final keyword in java 
class Display
{
	 int num=18;
	 void Num()
	 {
	   System.out.println("RadhaputraAbhishek");
	    }
}
class Printing extends Display
{
	void Num()
	{
		System.out.println("KrishnaPutraAbhishek");
	}
	public static void main(String ... args)
	{
		Printing pr=new Printing();
		pr.Num();
	}
}

