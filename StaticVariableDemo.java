class StaticVariableDemo
{
	int emp_id;
	String name;
	static String com_name="FCT";
StaticVariableDemo(int emp_id,String name)
{
	this.emp_id=emp_id;
	this.name=name;
}
void show()
{
System.out.println("\nId:"+emp_id+ "\nName:"+name+"\nCompany Name:"+com_name);
}
public static void main(String args[])
	{
		StaticVariableDemo e1=new StaticVariableDemo(101,"vaishnavi");
		StaticVariableDemo e2=new StaticVariableDemo(102,"Radha");

		e1.show();
		e2.show();

	}
}