class ThisDemo
{
      int id;
      String name;
      double marks;
      public ThisDemo(int id, String name, double marks)
      {
           this. id=id;             // this keyword is used to access current instance of class
           this.name=name;    
	   this.marks=marks;
      }
      void display()
     {  
        System.out.println("Student Details..");
        System.out.println("Id: "+id+ "\nName :" +name+ "\nMarks :" +marks);
     }
    public static void main(String args[])
    { 
      ThisDemo s1=new ThisDemo(101,"vaishnavi",80.00);  
       s1.display();  
      ThisDemo s2=new ThisDemo (102,"vaidehi",90.00);
       s2.display();
    }

}
