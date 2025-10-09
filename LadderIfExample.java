/* 2.Write a Java Program on Electricity Bill usage to show low medium and high usage
<100
101> and <300
>300 */

class LadderIfExample{

          public static void main(String args[]){

           int unit=1000;
           if(unit<=100){
             System.out.println("Low");
           }
          else if ((unit>=101) && (unit<=300)){
             System.out.println("Medium");
          }
          else if (unit>=301){
             System.out.println("High");

          }
          else{
             System.out.println("No bill");
          }
}
        }