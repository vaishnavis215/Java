//Polymorphism: Many forms Of methods that we write single class or inherit class
class PolymorphismDemo
{
	void display()
	{
		System.out.println("Display Method....");
	}
	void display(int a)
	{
		System.out.println("Display Method...ID:"+a);
	}
       void display(String n)
	{
		System.out.println("Display Method...Name:"+n);
	}
	public static void main(String args[])
	{
		PolymorphismDemo p1=new PolymorphismDemo();
		p1.display();
		p1.display(100);
		p1.display("Vaishnavi");
	}
	
}