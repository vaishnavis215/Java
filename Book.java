class Book 
{
    String bookName;
    String author;
    int price;

    void read() 
    {
        System.out.println("The book" + bookName + "is open. the Author of the book is " + author +" Start reading...");
    }

    void close() 
    {
        System.out.println("Thank you for reading the book!"+price+" was the price");
    }

    public static void main(String args[]) 
    {
        Book b1= new Book();      
        b1.bookName = "Chava";          
        b1.author = "XYZ";
        b1.price = 450;

        b1.read();              
        b1.close();            
    }
}