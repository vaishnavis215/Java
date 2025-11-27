/*Q.write a java program to display usage of final variable and final class 
it should include constant class which contain final variable as pi
next you have to use pi to calculate area of circle in another class which is useto calculate area of circle*/
final class Area{
	final static double pi=3.14;
}
class AreaOfCircle{
double radius;
 public AreaOfCircle(double radius) 
	{
  	      this.radius = radius;
 	   }
 public void calculateArea() {
        double area = Area.pi* radius * radius;
        System.out.println("Area of Circle with radius " + radius + " = " + area);
    }
    public static void main(String args[]) {

       AreaOfCircle a1 = new AreaOfCircle(5.0);
        a1.calculateArea();
    }
}