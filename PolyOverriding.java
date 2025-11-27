//Polymorphism: Many forms Of methods that we write single class or inherit class
//Overriding: Same method in Different class
class Demo
{
	void display()
	{
		System.out.println("Display Method....");
	}
}
class Demo2 extends Demo
{
	void display(int a)
	{
		System.out.println("Display Method...ID:"+a);
	}  
}
class PolyOverriding extends Demo2
{
	void display(String n)
	{
		System.out.println("Display Method...Name:"+n);
	}
	public static void main(String args[])
	{
		PolyOverriding p1=new PolyOverriding();
		p1.display();
		p1.display(100);
		p1.display("Vaishnavi");
	}
}	
