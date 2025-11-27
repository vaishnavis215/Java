class Father
{
String surname="suryawanshi";
}
class Brother extends Father
{
String name="Rohan";
}
class Sister extends Father
{
String name="Radha";
}
class A2
{
public static void main(String args[])
{
	Brother b1=new Brother();
	System.out.println("Brther Name:"+b1.name+ " "+b1.surname);
        Sister b2=new Sister();
	System.out.println("Brther Name:"+b2.name+ " "+b2.surname);


}
}