class ParameterizedStudent
{
      int id;
      String name;
      double marks;
      public ParameterizedStudent(int i, String n, double m)
      {
           id=i;
           name=n;
	   marks=m;
      }
      void display()
     {  
        System.out.println("Student Details..");
        System.out.println("Id: "+id+ "\nName :" +name+ "\nMarks :" +marks);
     }
    public static void main(String args[])
    { 
       ParameterizedStudent s1=new ParameterizedStudent (101,"vaishnavi",80.00);  // default constructor is automatically call when we create object
       s1.display();    // default contructor is used to set state of the object to its default value
       ParameterizedStudent s2=new ParameterizedStudent (102,"vaidehi",90.00);
       s2.display();
    }

}