package package1;

public class PrivateDemo{
private int no=10;
private void printDetails()
{
	System.out.println("Private Method..");
}
public static void main(String args[]){
	PrivateDemo p1=new PrivateDemo();
	System.out.println(p1.no);
	p1.printDetails();
}
}