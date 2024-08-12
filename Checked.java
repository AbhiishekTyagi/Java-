// Multilevel Inheritance in java 
class Multi
{
	public void check()
	{
		System.out.println("Geeks");
	}
}
class Multi1 extends Multi
{
	public void print_for()
	{
		System.out.println("for");
	}
}
class Multi2 extends Multi1
{
	public void print_geeks()
	{
		System.out.println("Geeks");
	}
}
class Checked
{
	public static void main(String ... args)
	{
		Multi2 m=new Multi2();
		m.check();
		m.print_for();
		m.print_geeks();
    }
}