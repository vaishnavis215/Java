// create class and object for movie,mobile,room,watch,book,account,person,bike,student,shape,country,address,laptop

class Shape
{
    String type;
    double area;

   void Draw()
  {  
      System.out.println( "Draw "+type);
  }
  void AreaCalculate()
 {
     System.out.println("Area of  " +type+  "  is  " +area);
  }

public static void main(String args[])
{ 
    Shape Sh1=new Shape();
    Sh1.type="circle";
    Sh1.area=78.56 ;
    Sh1.Draw();
    Sh1.AreaCalculate();
}
}