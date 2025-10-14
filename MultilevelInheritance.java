//Multilevel Inheritance
class Employee
{
	int salary=40000;
	String company_name="FCTP";
}
class Programmer extends Employee
{
	int bonus=10000;
	String name="Radha Suryawanshi";
	String skills="Java";	
}
class JrProgrammer extends Programmer
{
	int bonus=5000;
	String name="Vedika Surwase";	
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		JrProgrammer p1=new JrProgrammer();
		System.out.println("Name:"+p1.name+"\nSalary:"+p1.salary+"\nBonus:"+p1.bonus+"\nCompany:"+p1.company_name+"\nSkills:"+p1.skills);
	}
}