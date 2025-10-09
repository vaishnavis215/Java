

public class Person {
	String name ;
	int age;
	String address;
	
	void Intro()
	{
		System.out.println("Hi...! "+name+" Is my Name And i am "+age+" age old...."+address+" is my address");
	}

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "Vaishnavi";
		p.age=23;
		p.address="Pune";
		
		p.Intro();
	}

}