class GrandFather
{
String g_name="Suresh";
String surname="Suryawanshi";
int property=10000000;
}
class Father extends GrandFather
{
String f_name="mahesh";
int own_pf=2000000;
}
class Me extends Father
{
String name="Suraj";
}
class InheritanceDemo3
{
	public static void main(String args[])
	{
		Me a1=new Me();
		System.out.println("Grandfather name:"+a1.g_name+" "+a1.surname+"\nGrandfather Property:"+a1.property+"\nFather name:"+a1.f_name+" "+a1.surname+"\nMy Name:"+a1.name+" "+a1.surname);
	}
	
}