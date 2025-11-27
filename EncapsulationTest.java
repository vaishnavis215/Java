import package1.EncapsulationDemo;

class EncapsulationTest{
	public static void main(String args[])
	{
	EncapsulationDemo s1=new EncapsulationDemo();
	s1.setId(10);
	s1.setName("vaishnavi");
	s1.setCity("Pune");

	System.out.println("Student Id:"+s1.getId+"\nStudent Name:"+s1.getName+"\nStudent City:"+s1.getCity);
	}
}