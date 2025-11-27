//import Account;
class ATM{
public static void main(String args[])
{
	Account a1=new Account();
	
	System.out.println("Balance:"+a1.viewBalance()+"\nAfter deposit Balance:"+a1.depositBal(1000000)+"\nAfter withdraw balance:"+a1.withdrawBal(15000));
}

}