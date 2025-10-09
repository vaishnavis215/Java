// this keyword is used to call another class method using reference to the current object
class A
{
	A getA()
	{
		return this;
	}
	void massage()
	{
	System.out.println("Hello...");
	}
}
class This_Reference
{
	public static void main(String args[])
	{
		new A().getA().massage();
	}
}