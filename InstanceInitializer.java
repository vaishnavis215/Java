// Instance Initializer: it doesn't have name
//it will execute before constructor
//To set the common value 
//use to initialize instance variable
class InstanceInitializer
{
	double acBalance;
	InstanceInitializer()
	{
		System.out.println("Balance="+acBalance);
	}	
	{
		acBalance=100000;
		System.out.println("Check Balance..");
	}
	public static void main(String args[])
	{
		InstanceInitializer a1=new InstanceInitializer();
	}
		
}