/*Final Keyword: it will act as constant, once we initialize it we can't able to change its value.
1. Variable
*/
class FinalVariableDemo{
	final int no=50;
	void display()
	{
		no=100;
		System.out.println("value of No:"+no);
	}
public static void main(String args[])
{
	FinalVariableDemo f1=new FinalVariableDemo();
	f1.display();
}

}