
import java.io.FileReader;

class CompileTimeException {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("missing.txt");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
