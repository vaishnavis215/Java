
// calling one constructor from another constructor called constructor chaining
class ConstructDemo
{
	int RollNo;
	String name,cource;
	float fees;
        
        ConstructDemo(int RollNo,String name)
	{
                this.RollNo=RollNo;
		this.name=name;	
	}
	ConstructDemo(int RollNo,String name,String cource)
 	{ 
		this(RollNo,name);
		this.cource=cource;
	}
	ConstructDemo(int RollNo,String name,String cource,float fees)
	{
		this(RollNo,name,cource);// reusing contructor or contructor chaining
		this.fees=fees;
	}
	void display()
	{
		System.out.println("\nRollNumber: "+RollNo+ "\nName: " +name+ "\nCource: " +cource+ "\nFees: \n" +fees);
	}
public static void main(String args[])
{
	ConstructDemo s1=new ConstructDemo(101,"vaishnavi","Full-stack",35000);
	ConstructDemo s2=new ConstructDemo(102,"vedika","Mern-stack",45000);
	s1.display();
        s2.display();
       
}
}
