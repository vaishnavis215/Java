//
class Employee
{
	int salary=40000;
	String company_name="FCTP";
}
class Programmer extends Employee
{
	int salary=50000;
	int bonus=10000;
	String name="Radha Suryawanshi";

	
}
class InheritanceDemo
{
	public static void main(String args[])
	{
		Programmer p1=new Programmer();
		System.out.println("Name:"+p1.name+"\nSalary:"+p1.salary+"\nBonus:"+p1.bonus+"\nCompany:"+p1.company_name);
	}
}