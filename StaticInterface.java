interface Drawing
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Rectangle implements Drawing
{
	public void draw()
	{
	System.out.println("Drawing Rectangle..");
	}
}
class StaticInterface
{
	public static void main(String args[])
	{
		Drawing d1=new Rectangle();
		d1.draw();
		System.out.println("Cube of 10 is "+Drawing.cube(10));	
	}
}