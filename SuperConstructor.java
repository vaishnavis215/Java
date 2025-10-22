//Super Keyword is use to
//3.Access parent Constructor in child class
//just like a constructor chaining we can access contstructor arguments using super keyword
class Account
{
	int AcNo;
	String AcHolderName;
	public Account(int AcNo,String AcHolderName)
	{
		this.AcNo=AcNo;
		this.AcHolderName=AcHolderName;
	}	
}
class SuperConstructor extends Account
{
	String AcType;
	SuperConstructor(int AcNo,String AcHolderName,String AcType)
	{
		super(AcNo,AcHolderName);
		this.AcType=AcType;
	}
	void display()
	{
		System.out.println("Account No.:"+AcNo+"\nAccount Holder Name:"+AcHolderName+"\nAccount Type:"+AcType);
	}
	public static void main(String args[])
	{
		SuperConstructor a1=new SuperConstructor(180006789,"Vaishnvai Suryawanshi","Saving");
		a1.display();
	}
}