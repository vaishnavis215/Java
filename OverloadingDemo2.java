// method overloading is done by the changing the type of argument or number of arguments only.
class OverloadingDemo2
{
	void show()
	{
		System.out.println("Hello...");
	}
	int show()
	{
		System.out.println("Welcome To..."+c_name);
	}
	

	public static void main(String args[])
	{
		OverloadingDemo2 d1=new OverloadingDemo2();
		d1.show();
		d1.show();
	}	
}
