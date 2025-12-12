// this keyword is used to pass as a argument to constructor  
class This_construct
{
	TestThis obj;
	public This_construct(TestThis obj)
	{
		this.obj=obj;
	}
	void info()
	{
		System.out.println("Vaishnavi:"+obj.data);
	}
}
class Radha
{
	TestThis obj1;
	public Radha(TestThis obj1)
	{
		this.obj1=obj1;
	}
	void info()
	{
		System.out.println("Vedika:"+obj1.data);
	}
}
class TestThis
{
        int data=50;
	TestThis()
	{
		This_construct c1=new This_construct(this);
		c1.info();
		Radha c2=new Radha(this);
		c2.info();
        }
public static void main(String args[])
{
       TestThis t1=new TestThis();	
	   
}
}