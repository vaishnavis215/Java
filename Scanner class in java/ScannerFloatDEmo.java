import java.util.Scanner;

public class ScannerFloatDEmo {

    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Your Name:");
       // String name=sc.next();// read one  word /single string
       // System.out.println("Your Name:"+name);

        //  System.out.println("Enter Your Name Again:");
        //  String name2=sc.nextLine(); // read one line
        //  System.out.println("Your Name:"+name2);

         //hasnext(): this method will validate wether your scanner contains another token

         Scanner sc1=new Scanner("Hello VAishnavi Suryawanshi...");
          
         while(sc1.hasNext()){
            System.out.println(sc1.nextLine());
         }

         Scanner sc2=new Scanner("Hello VAishnavi Suryawanshi\nPlease Share your Cv..");
         while(sc2.hasNextLine()){

            System.out.println(sc2.nextLine());
         }
    }
}
