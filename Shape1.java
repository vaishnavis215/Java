//WAP to calculate area of circle,square,rectangle using method overloading
class Shape1
{
 void area(double r)
{
	double res=3.14*r*r;
	System.out.println("Area of  Circle:"+res);
}
 void area(int s)
{
	int s_res=s*s;
	System.out.println("Area of  Square:"+s_res);
}
 void area(int l,int w)
{
	int r_res=l*w; 
	System.out.println("Area of  Rectangle:"+r_res);
}
public static void main(String args[])
{
	Shape1 s1=new Shape1();
	s1.area(5.0);
	s1.area(10);
	s1.area(5,5);
}
}
