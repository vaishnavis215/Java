interface A
{
	int id=100;
}
interface B
{
	String name="Vaishnavi";
}
class C implements A,B
{
	String cource="java";
	void display()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\nCource:"+cource);
	}
}
class D extends C
{
	String city="Pune";
}
class HybridInheritance extends C
{
	double fees=40000;
	public static void main(String args[])
	{
		C c1=new C();
		c1.display();
		D c2=new D();
		System.out.println("City"+c2.city);
		HybridInheritance c3=new HybridInheritance();
		System.out.println("Fees"+c3.fees);
	}
}