/* 2) 100% abstraction=interface
-static,constants and abstract methods
*/
interface Shape
{
	 void draw();
	 void display();
	 default void run()
{
System.out.println("Default method is used when there is no need to implement in every class..");
}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing circle..");
	}
	public void display()
	{
		System.out.println("Display circle..");
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Drawing square..");
	}
	public void display()
	{
		System.out.println("Display square..");
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		Shape s1=new Circle();
		Shape s2=new Square();
		s1.draw();
		s1.display();
		s2.run();
                s2.draw();
		s2.display();

	}
}