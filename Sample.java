//this keyword can be passed as an argument to a method,
//
class Sample
{
	void display(Sample obj)
	{
		System.out.println("Display method Executed");
	}
	void show()
	{
		System.out.println("Show method executed..");
		display(this);
	}
	void info()
	{
		System.out.println("Info method executed..");
		display(this);
	}
	
	public static void main(String args[])
	{
		Sample s1=new Sample();
		s1.show();
		Sample s2=new Sample();
		s2.info();
	}
}