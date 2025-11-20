
import java.io.FileReader;
import jdk.jshell.spi.ExecutionControl;

class InterruptedExceptionDemo {

    public static void main(String[] args) {
        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
