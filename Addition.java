//Methid Overloading in java perform in same class 
//Compile-time polymorphism in java 
class Addition 
{
	//Overload this method 
	 static int add(int x,int y)
	{
		return x+y;
	}
   
    static float add(float x,float y)
   {
   	  return x+y;
   }

   static  float  add(int x,float y)
   {
   	  return x+y;
   }

    static float  add(float x, int y)
   {
   	  return x+y;
   }

    static int add(int x,int y,int z)
   {
   	 return x+y+z;
   }

    static float add(float x,float y,float z)
   {
   	 return x+y+z;
   }
   public static void main(String ... args)
   {
   	  System.out.println("Addition="+add(2.5f,3));
   }
}
