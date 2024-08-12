//Example of Dynamic binding 
class Animal 
{
	void run()
	{
		System.out.println("Animal Is Running");
	}
}
class Dog extends Animal
{
   void run()
   {
   	System.out.println("Dog is Running");
   }
}
public class Check
{
	public static void main(String ... args)
	{
		//Reference object 
		Animal an;
		an=new Animal();
		an.run();
		an=new Dog();//Dynamic binding 
		an.run();
	}
}