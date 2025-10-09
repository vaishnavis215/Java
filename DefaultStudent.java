class DefaultStudent
{
      int id;
      String name;
      double marks;
      public DefaultStudent()
      {
      }
      void display()
     {  
        System.out.println("Id: "+id+ " Name :" +name+ " Marks :" +marks);
     }
    public static void main(String args[])
    { 
       DefaultStudent s1=new DefaultStudent();  // default constructor is automatically call when we create object
       s1.display();    // default contructor is used to set state of the object to its default value

    }

}