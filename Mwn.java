//Encapsulation in java
class Men
{
	int age;
	private String name;
	//Public Setter methods 
	public void setName(String nam)
	{
		name=nam;
	} 
	public void setAge(int ag)
	{
		age=ag;
    }
    //Public getter methods 
    public int getAge()
    {
    	return age;
    }
    public String getName()
    {
    	return name;
    }
}
public class Mwn
{
	public static void main(String ... args)
	{
	  //Creating the object of Men class
		Men m=new Men();
		m.setName("Abhishek");
		m.setAge(23);
		System.out.println("Name="+m.getName());
		System.out.println("Age="+m.getAge());
	}
} 