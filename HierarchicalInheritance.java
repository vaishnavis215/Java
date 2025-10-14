//Hierarchical Inheritance
class Employee
{
	int salary=40000;
	String company_name="FCTP";
}
class Programmer extends Employee
{
	int bonus=10000;
	String name="Radha Suryawanshi";
	String role="Developer";
	String skills="Java";	
}
class Tester extends Employee
{
	int bonus=5000;
	String name="Vedika Surwase";
	String role="Tester";
	String skills="selenium";	
}
class HierarchicalInheritance
{
	public static void main(String args[])
	{
		Programmer p1=new Programmer();
		System.out.println("Name:"+p1.name+"\nSalary:"+p1.salary+"\nBonus:"+p1.bonus+"\nCompany:"+p1.company_name+"\nRole:"+p1.role+"\nSkills:"+p1.skills);

		Tester t1=new Tester();
		System.out.println("\nName:"+t1.name+"\nSalary:"+t1.salary+"\nBonus:"+t1.bonus+"\nCompany:"+t1.company_name+"\nRole:"+t1.role+"\nSkills:"+t1.skills);

	}
}