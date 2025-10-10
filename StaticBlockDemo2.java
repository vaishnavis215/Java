class StaticBlockDemo2
{
	int a;
	static int b;
	StaticBlockDemo2()
	{
		
	}
	static{int b=10;System.out.println("Static block Executed...");}
	
	void show()
	{
		System.out.println("A:"+a+"\nB:"+b);
	}
	public static void main(String args[])
	{
		StaticBlockDemo2 s1=new StaticBlockDemo2();
		s1.show();
	
	}
}