class A 
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	void eat()
	{
		System.out.println(name+"eats milk and meat..");
	}
}
class B extends A
{
	B(String name)
	{
		super(name);
	}
	void eat()
	{
		System.out.println(name+"eats  meat..");
	}
}
class InheritanceDemo2 
{
	public static void main(String args[])
	{
		InheritanceDemo2 i1= new InheritanceDemo2("cat");
		i1.eat();
		InheritanceDemo2 i2= new InheritanceDemo2("dog");
		i2.eat();
	}
}