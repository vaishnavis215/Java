
import java.io.FileReader;

class ClassNotFoundDemo {

    public static void main(String[] args) {
        try {

            Class.forName("com.sam");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
