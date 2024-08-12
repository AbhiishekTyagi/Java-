//Encapsulation in java 
import java.util.Scanner;
class Person
{
	 private String name;
     private int age;

	//Setter method to set the value 
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	} 
	public int getAge()
	{
		return age;
	} 
	public void setAge(int agee)
	{
       age=agee;
	} 
}
class Cap
{
	public static void main(String ... args)
	{
		Person p=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String nam =sc.nextLine();
        System.out.println("Enter the Age");
        int ages =sc.nextInt();
        p.setName(nam);
        p.setAge(ages);
        System.out.println("Name="+p.getName());
		System.out.println("Age="+p.getAge());
	}
}