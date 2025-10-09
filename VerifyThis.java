class VerifyThis
{
	void info()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		VerifyThis t1=new VerifyThis();
		System.out.println(t1);
		t1.info();
		
	}
}