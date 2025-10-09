class UserDefMethod
{

    void display()
    {
      System.out.println("This is user defiened method...non-static..");
    }
   static void goOut()
    {
      System.out.println("This is static method..");
    }
    public static void main(String args[])
    {
        UserDefMethod m1=new UserDefMethod();
        m1.display();  
        goOut();  // static methods are called without any object

     }

}