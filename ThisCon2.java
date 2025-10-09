class ThisCon1
{
   void display(int b)
   {
     System.out.println("hello from display.."+b);
    }
   void show(int a)
   {
	System.out.println("hello from show.."+a);
        this.display(a);  //this.display()=display()
    }

}

class ThisCon2
{
 	public static void main(String args[])
       {
		ThisCon1 t1=new ThisCon1();
                 t1.show(10);
 		ThisCon1 t2=new ThisCon1();
                 t2.show(20);
	}
}