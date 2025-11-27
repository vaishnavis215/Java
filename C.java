//Multiple Inheritance:java does't Support Multiple Ihneritance with classes 
//To avoid ambiguity
class A
{
	int id=100;
}
class B
{
	String name="Vaishnavi";
}
class MultipleInheritance extends A,B
{
	int cource="java";
	void display()
	{
		System.out.println("Id: "+id+"Name: "+name+"cource: "+cource);
	}
	public static void main(String args[])
	{
		 MultipleInheritance c1=new MultipleInheritance();
		c1.display();
	}
}

