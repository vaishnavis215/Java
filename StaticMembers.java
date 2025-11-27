class Example
{
	private static int y;
	static void showInfo()
	{
		y=50;
	}
	int x;
	void show()
	{
		y=22;
	}
	void info()
	{
		System.out.println(y);
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Example.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
class StaticMemebrs
{
	public static void main(String args[])
	{
		Example e1=new Example();
		Example e2=new Example();
		e1.show();
		e1.info();
		e2.show();
		Example.showInfo();
		
	}

	
}