
class P1
{
	public static void main(String ... args)
	{
       Dog dg=new Dog();
         dg.run();
         Animal am=new Animal();
           am.run();
	}
}
class Animal
{
	void run()
	{
	   System.out.println("Animal is running");
	}
}
class Dog extends Animal
{
	void run()
	{
		System.out.println("Dog is ruunning");
	}
}

