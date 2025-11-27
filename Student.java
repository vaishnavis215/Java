// create class and object for movie,mobile,room,watch,book,account,person,bike,student,shape,country,address,laptop

class Student
{
    String name;
    int age;
    String cource;

   void AttendClass()
  {  
      System.out.println(name+ "  Attending The class...  ");
  }
  void AssignmentSub()
 {
     System.out.println(name+ "  Submitted All the Assignments Regularly...");
  }
 void StudentDetails() {
        System.out.println("Name: " + name  + ", Age: " + age + " Cource: " + cource);
    }
public static void main(String args[])
{ 
    Student S1=new Student();
    S1.name="vaishnavi  suryawanshi";
    S1.age=23 ;
    S1.cource="Java Full-Stack";
    S1.StudentDetails();
    S1.AttendClass();
    S1.AssignmentSub();
}
}