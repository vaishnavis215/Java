
import java.io.*;

class ThrowsDemo2 {

    void show() throws IOException {
        System.out.println("Throws keyword is used to inform progammer he has used exception handling..");
    }

}

class ThrowsDemo3 {

    public static void main(String[] args) {
        ThrowsDemo2 t1 = new ThrowsDemo2();
        try {
            t1.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
