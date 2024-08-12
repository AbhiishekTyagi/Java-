// Single Inheritance in Java
class Single{
    public void print_geeks()
    {
        System.out.println("Geeks");
    }
}
class Mingle extends Single{
    public void print_for()
    {
        System.out.println("for");
    }
}
class Driversity
{
    public static void main(String ... args)
    {
        Mingle m=new Mingle();
        m.print_geeks();
        m.print_for();
        m.print_geeks();
    }
}