class StaticMethodDemo
{
	int emp_id;
	String name;
	static String com_name="FCT";
StaticMethodDemo(int emp_id,String name)
{
	this.emp_id=emp_id;
	this.name=name;
}
static void change()
{
	com_name="FCTP";
}
void show()
{
System.out.println("\nId:"+emp_id+ "\nName:"+name+"\nCompany Name:"+com_name);
}
}
class  StaticMethodDemo2
{
	public static void main(String args[])
	{
		StaticMethodDemo e1=new StaticMethodDemo(101,"vaishnavi");
		StaticMethodDemo e2=new StaticMethodDemo(102,"Radha");
		StaticMethodDemo.change();
		e1.show();
		e2.show();

	}
}
