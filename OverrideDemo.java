//Method Overriding: Same method but in different class.
//once we declare a scope of method we can't be decrease the scope but we can increase the scope.
//when we change the return type that time there is no override that two mwthods treated as different methods.
class Massage
{
	public void greet()
	{
		System.out.println("Hello...Vaishanvi");
	}
}
class OverrideDemo extends Massage
{
	public void greet()
	{
		System.out.println("Hello...Vaishnavi\nWelcome to FCT...");
	}
	public static void main(String args[])
	{
		 OverrideDemo d1=new  OverrideDemo();
		d1.greet();
	}
}
