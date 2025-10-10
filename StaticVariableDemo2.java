class StaticVariableDemo2
{
	static int count=0; // static variable does not create a new copy of its variable it assigns only once
	//int count1=0;//instance variable creates new copy when new object creates 
StaticVariableDemo2()
{
	count++;
	System.out.println(count);
}

public static void main(String args[])
	{
		
		StaticVariableDemo2 c1=new StaticVariableDemo2();
		StaticVariableDemo2 c2=new StaticVariableDemo2();
		StaticVariableDemo2 c3=new StaticVariableDemo2();



	}
}