class StaticDemo
{
	static int a=50;
	final static int b=60;
public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);
		
		a=100;
		//b=600;

		System.out.println(a);
		System.out.println(b);
	}
}