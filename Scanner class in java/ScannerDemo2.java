import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {

         Scanner sc2=new Scanner("my age is 23");
         while(sc2.hasNext()){
            if(sc2.hasNextInt())
                System.out.println(sc2.next()); //check is there a integer number or not

                else
                sc2.next();            

            
         }
    }
}
