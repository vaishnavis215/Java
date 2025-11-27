
// To access private method we need to call it in their class's another non-private method

interface MyInterface
{
 default void show()
 {
	System.out.println("Use to Show massage..");
	display();
 }
private void display()
 {
	System.out.println("Use to print private massage..");
 }

}
class Demo implements MyInterface
{
}
class PrivateInterface
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.show();
	}
}