/*
Abstraction: Showing functionality and hiding details or complex information
1) 0 to 100% abstraction=Abstract
-A class which declare with abstract keyword
-can not be instanciated(can not be create abject of abstract class)
-Also contains constructor, static methods and final methods
-it contains abstract and non-abstract methods
-Abstract method: Method without body
-ex. void display(); -Abstract method
-non-abstract method: Methods with body
-ex.	void display()
	{
		System.out.println("hello");  //non-abstract method
	}
-to access the abstract method we need to override that method in child class
*/
abstract class Demo
{
	abstract void show();
	
	void display()
	{
		System.out.println("This is non-abstract method..");
	}
}
class Abstraction extends Demo
{
	void show()
	{
		System.out.println("This is abstract method..");	
	}
}
class AbstractionDemo
{
	public static void main(String args[])
	{
		Abstraction d1=new Abstraction();
		d1.display();
		d1.show();
	}
}