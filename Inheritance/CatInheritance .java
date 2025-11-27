//Inheritance: Establishing relation between classes as parent-child
//where a child class can access all properties from parent class
//'is-a' kind of relationship
class InheritanceAnimal
{
	String name;
	InheritanceAnimal(String name)
	{
	this.name=name;
	}
	void eat()
	{
		System.out.println(name+ "  Is Eating...");
	}
	void makeSound()
	{
		System.out.println(name+ " Is Making sound..");
	}
}
class Dog extends InheritanceAnimal
{
	Dog(String name)
	{
		super(name);
	}
	void eat()
	{
		System.out.println(name+" Eats meal..");
	}   
}
class Cat extends InheritanceAnimal
{
	Cat(String name)
	{
		super(name);
	}
	void makeSound()
	{
		System.out.println(name+" Making Sound as Meow...");
	}
	public static void main(String args[])
	{
		Cat c1=new Cat("Cat");
		c1.eat();
		c1.makeSound();
		Dog d1=new Dog("Dog");
		d1.eat();
		d1.makeSound();
	}
}
