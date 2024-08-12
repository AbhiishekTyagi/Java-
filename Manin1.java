//Method Overloading(Compile-Time Polymorphism)
class Helper
{
	//Overloaded methods 
	static int multiply(int a,int b)
	{
		return a*b;
	}
	static double multiply(double a,double b)
	 {
	 	return a*b;
	 }
     static float multiply(int a,float b)
     {
     	return a*b;
     }
     static int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
	static float multiply(float b,int a,)
     {
     	return a*b;
     }
}
class Main1
{
	public static void main(String... args)
	{
	  //All these static methods call with the help of Class Name also.
       System.out.println(Helper.multiply(2,4));
	 }
}