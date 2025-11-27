// while loop
class WhileExample
{
     public static void main(String args[])
     {
         int num=123456;
         while(num!=0)
         {

           int digit=num%10;
           num=num/10;
           System.out.println(digit);
        }

     }
}