class Books {
    String bookName;
    String author;
    int price;

    void read() {
        System.out.println("The book " + bookName + " is open. The author of the book is " + author + ". Start reading...");
    }

    void close() {
        System.out.println("Thank you for reading the book! The price was " + price);
    }

    public static void main(String args[]) {
        Books b1 = new Books();     // ✅ Class name corrected
        b1.bookName = "Chava";
        b1.author = "XYZ";
        b1.price = 450;

        b1.read();
        b1.close();
    }
}
