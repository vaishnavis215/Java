//difference between has-a and is-a relationship

class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}
class Employee{
	int empId;
	String empName;
	Address eAddress;
	Employee(int empId,String empName,Address eAddress)
	{
		this.empId=empId;
		this.empName=empName;
		this.eAddress=eAddress;
	}
	void display()
	{
		System.out.println( "Employee Id:"+empId+"\nEmployee Name:" +empName);
		System.out.println(eAddress.city+","+eAddress.state+","+eAddress.country);

	}
}
class AgreegationDemo
{
	public static void main(String args[])
	{
		Address a1=new Address("Pune","Maharashttra","India");
		Employee e1=new Employee(101,"vaishnavi",a1);
		e1.display();
	}

}