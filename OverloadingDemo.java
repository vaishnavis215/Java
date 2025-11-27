// method overloading is done by the changing the type of argument or number of arguments only.
class OverloadingDemo
{
	void show()
	{
		System.out.println("Hello...");
	}
	void show(String c_name)
	{
		System.out.println("Welcome To..."+c_name);
	}
	void show(String city,String cource)
	{
		System.out.println(city+"\nFor the Cource.."+cource);
	}
	void show(int fees)
	{
		System.out.println("Fees:"+fees);
	}
	public static void main(String args[])
	{
		OverloadingDemo d1=new OverloadingDemo();
		d1.show();
		d1.show("FCT");
		d1.show("PCMC-Pune","Java Full Stack");
		d1.show(40000);
	}	
}
