// can access Any private Static member variable another class with the help of static method in that class,we can call class name with that method
class Demo1
{
	private static int x;
	static void show()
	{
		x=5;
	System.out.println(x);
	}
}
class Program
{
public static void main(String args[])
{
	Demo1.show();
}
}