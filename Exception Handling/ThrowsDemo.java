/*
Throws keyword:Compile time Exception
-using Throw And Throws Keyword.
-used to declaring an exception which inform programmer that he has to use exception handiing.
 */
import java.io.FileNotFoundException;
import java.io.*;

class ThrowsDemo {

    public static void show() throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\user\\Desktop\\abc.txt");

        throw new FileNotFoundException();

    }

    public static void main(String[] args) {
        try {
            show();
        } catch (Exception e) {
        }
        System.out.println("Rest of the code..");
    }
}
