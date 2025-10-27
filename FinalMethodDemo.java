/*Final method: A method is declare with final keyword, which can not be overridden in child class.
It will show error.
*/
class FinalMethod
{
	final void display()
	{
		System.out.println("Display method of parent class");
	}
}
class  FinalMethodDemo extends FinalMethod
{
	
	void display()
	{
		System.out.println("Display method of child class");
	}

	public static void main(String args[])
	{
		FinalMethodDemo f1=new FinalMethodDemo();
		f1.display();
	}
}