class ThisConstruct
{
   public ThisConstruct()
   {
     this(10);
     System.out.println("Default Constructor..");
    }
   public ThisConstruct(int id)
   {
       //this();
	System.out.println("Parameterized Constructor..."+id);
    }

}

class ThisConstruct2
{
 	public static void main(String args[])
       {
		 //ThisConstruct c1=new ThisConstruct(10);
		 ThisConstruct c1=new ThisConstruct();

                 
               	}
}