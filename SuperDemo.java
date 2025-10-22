/*Super Keyword is use to
1.Access parent variable in child class
We need to write super keyword in any instance method in child class
to access parent class variable .
*/
class Parent
{
	String massage="Happy Diwali";
}
class SuperDemo extends Parent
{
	String massage="Everyone";
void show()
{
	System.out.println(super.massage);
	System.out.println(massage);
}
public static void main(String args[])
{
	SuperDemo d1=new SuperDemo();
	d1.show();
}
}
