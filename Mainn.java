//Constructor in abstract clas
abstract class Checker
{
	Checker()
	{
		System.out.println("Constructor Checkewr is running");
	}
	abstract void checking();
    void adding()
    {
    	System.out.println("Adding is pERFORM");
    }
}
class Subclass extends Checker
{
	void checking()
	{
		System.out.println("Checking is done!");
	}
}
class Mainn
{
	public static void main(String ... args)
	{ 
      
       Subclass ch=new Subclass();
       ch.checking();
       ch.adding();
	}
}