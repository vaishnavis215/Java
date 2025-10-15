//Multiple Inheritance:Java does't Support Multiple Ihneritance with classes 
//To avoid ambiguity
//But we can able to achieve this using interface
interface A
{
	int id=100;
}
interface B
{
	String name="Vaishnavi";
}
interface C
{
	String city="Pune";
}
class MultipleInheritance implements A,B,C
{
	String cource="java";
	void display()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\ncource:"+cource+"\nCity:"+city);
	}
	public static void main(String args[])
	{
		 MultipleInheritance c1=new MultipleInheritance();
		c1.display();
	}
}

