abstract class Bank
{
	abstract int getInterestRate();
}
class SBI extends Bank
{
	int getInterestRate()
	{return 8;}
}
class HDFC extends Bank
{
	int getInterestRate()
	{return 9;}
}
class BOM extends Bank
{
	int getInterestRate()
	{return 10;}
}
class ReuseAbstract
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Interest Rate Of SBI is  "+b.getInterestRate()+"%");
b=new HDFC();
System.out.println("Interest Rate Of HDFC is "+b.getInterestRate()+"%");
b=new BOM();
System.out.println("Interest Rate OF BOM is "+b.getInterestRate()+"%");
}

}