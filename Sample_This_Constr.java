//this keyword can be passed as an argument to a method,

class Sample_This_Method
{
	int id;
	String name;
	Sample_This_Method(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display(Sample_This_Method obj)
	{
		System.out.println("\nStudent details..");
		System.out.println("Id:" +id+ "\nName:"+name);
	}
	void show()
	{
		//System.out.println("Show method executed..");
		display(this);
	}
	void info()
	{
		//System.out.println("Info method executed..");
		display(this);
	}
	
	public static void main(String args[])
	{
		Sample_This_Method s1=new Sample_This_Method(101,"vaishnavi");
		s1.show();
		Sample_This_Method s2=new Sample_This_Method(102,"vedika");
		s2.info();
	}
}