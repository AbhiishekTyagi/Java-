//Access Modifers in Java //Encapsulation in java
class Modifers
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
    public void main(String ... args)
	{
	  //Creating the object of Men class
		Men m=new Men();
		m.setName("Abhishek");
		m.setAge(23);
		System.out.println("Name="+name);
		System.out.println("Age="+m.getAge());
	}
}