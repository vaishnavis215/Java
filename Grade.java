// to print grade of the student base on its percentage above 65 grade is c,75 grade is b,90 grade a

class Grade{
          
           public static void main(String args[]){

           int marks=70;

           if(marks>65)
           {
           System.out.println("Grade C..");
           }

           else if(marks>75)
           {
           System.out.println("Grade B..");
           }


           else if(marks>90)
           {
           System.out.println("Grade A..");
           }
          
           else{
           System.out.println("Fail");
           }

           }
           }