//Encapsulation in java 
class Encap
{
	 private int length;
	 private int breadth;

	 //Constructor to initialize the data member 

	 Encap(int len,int bred)
	 {
	 	length=len;
	 	breadth=bred;
	 }
	 //Method to Calculate the Area

	  public void area()
	  {
	  	int area=length*breadth;
	  	System.out.println("Area="+area);
	  }
}
class Cap1
{
  public static void main(String ... args)
  {
  	//Creating the object 
  	Encap ec=new Encap(3,4);
  	ec.area();
  }
}