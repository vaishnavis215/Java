class Animal
{
   String name="Elephant";

void eat()
{
 System.out.println("Animals eats:Fruits");

}

public static void main(String args[])
{
   Animal A1=new Animal();
   Animal A2=new Animal();
   System.out.println("Animal name:"+A1.name);
   A1.eat();
   A2.name="Tiger";
   System.out.println("Animal name:"+A2.name);
   
}






}