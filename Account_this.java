class Me
{
	Account_this obj;
	public Me(Account_this obj)
	{
		this.obj=obj;
	}
	void detail_Ac()
	{
		System.out.println("Account managed by myself..And I Debit"+obj.money+"rs");
	}
}
class Mother
{
	Account_this obj1;
	public Mother(Account_this obj1)
	{
		this.obj1=obj1;
	}
	void detail_Ac()
	{
		System.out.println("Account managed by my Mother..And She Withdrawing "+obj1.money1+ "rs");
	}
}
class Father
{
	Account_this obj2;
	public Father(Account_this obj2)
	{
		this.obj2=obj2;
	}
	void detail_Ac()
	{
		System.out.println("Account managed by myself..And my father Withdrawing "+obj2.money2+"rs");
	}
}
class Account_this
{
 	float money=50000,money1=30000,money2=10000;
      Account_this()
	{
		Me m1=new Me(this);
		m1.detail_Ac();
		Mother m2=new Mother(this);
		m2.detail_Ac();
		Father m3=new Father(this);
		m3.detail_Ac();
	}
	public static void main(String args[])
	{
		Account_this a1=new Account_this();
	}
}
