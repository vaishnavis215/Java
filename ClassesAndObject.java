class Nokia 
{
	private int roll;
	private int age;

	void setValue()
	{
		roll=101;
		age=23;
	}
	void display()
	{
		System.out.println(roll);
		System.out.println(age);
	}
}
class ClassesAndObject
{
public static void main(String args[])
{
	Nokia n1=new Nokia();
	n1.display();//when value not be assigns it prints 0 for int and null for string 
	n1.setValue();
	n1.display();
}	
}