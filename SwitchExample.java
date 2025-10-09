//switch case

class SwitchExample{
      
       public static void main(String args[]){

                 int ch;

                 System.out.println("1.Cricket");
                 System.out.println("2.Hocky");
                 System.out.println("3.Holyball");
                 System.out.println("4.Football");
                 System.out.println("5.Poker");

                ch=2;


                switch(ch)
                {
                  case 1:
                  System.out.println("My Feverate Sports is Cricket.");
                  break;

                  case 2:
                  System.out.println("My Feverate Sports is Hocky.");
                  break;

                  case 3:
                  System.out.println("My Feverate Sports is Holyball.");
                  break;

                  case 4:
                  System.out.println("My Feverate Sports is Football.");
                  break;
               
                  case 5:
                  System.out.println("My Feverate Sports is Pooker.");
                  break;

                  default:
                  System.out.println("Invalid input");
                  
                

                }




}

}