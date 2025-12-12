class Example
{
	private int x;
	private static int y;
	void show()
	{
		y=22;
		x=5;
	}
	void info()
	{
		System.out.println(x);
	}
	void showInfo()
	{
		y=50;
	}
}
class StaticMemebrs
{
	public static void main(String args[])
	{
		Example e1=new Example();
		Example e2=new Example();
		e1.show();
		e2.info();
		//e1.showInfo();
		
	}
}