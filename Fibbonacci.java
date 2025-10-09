// to print Fibonacci series upto 10 terms
class Fibbonacci
{
   public static void main(String args[])

{
int a=0,b=1;
 for(int i=2;i<=8;++i)
{   int t=a;
    System.out.println(a+b);
    a=b;
    b=t+b; 
}
      
}

}