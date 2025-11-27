
import java.util.StringTokenizer;

/*
String tokenizer: 
-converting String to tokens
-
 */
class StringTokenizerDemo {

    public static void main(String[] args) {
        // String s1 = "Have a nice day dear all..";

        String s1 = "Have,a,nice,day,dear,all..";

        StringTokenizer st = new StringTokenizer(s1);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));

        }
    }
}
