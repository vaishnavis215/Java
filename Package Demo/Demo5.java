class Demo5{
    public static void main(String args[])
    {
        char ch='a';

        if(ch>='A' && ch<='Z')
        {
            System.out.println("UPPERCASE");
        }
        else if(ch>='a' && ch<='z')
         {
            System.out.println("lowercase");
        }
        else{
            System.out.println("invalid character..");
        }
    }
}