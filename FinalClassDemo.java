/*Final class: A final class is declared with final keyword, which can not be inherited in child class.
It will show error.
*/
final class FinalClass
{
	void display()
	{
		System.out.println("Display method of parent class");
	}
}
class  FinalClassDemo extends FinalClass
{
	
	void display()
	{
		System.out.println("Display method of child class");
	}

	public static void main(String args[])
	{
		FinalClassDemo  f1=new FinalClassDemo ();
		f1.display();
	}
}