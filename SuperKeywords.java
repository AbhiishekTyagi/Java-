class Parent
{
  Parent() 
   {
     System.out.println("We Are in Super class=");
   }
}
class SubClass extends Parent
  {
    SubClass()
     {
       super();//Calling constructor of super class
     }
  }
    class SuperKeywords
     {
       public static void main(String[] args)
        {
          SubClass s1=new SubClass();// When we make a object of sub class so constructor call automatically
        }
     }
       
