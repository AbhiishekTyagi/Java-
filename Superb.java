//Dynamic binding in java in Method Overriding 
class Shape{
	void draw()
	{
		System.out.println("No Shape");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
} 
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw Circle");
	}
}
class Superb
{
	public static void main(String ... args)
	{
		//Reference variable
		Shape s;
		s=new Shape();
		s.draw();
		s=new Circle();
		s.draw(); 
		s=new Rectangle();
		s.draw();
	}
}