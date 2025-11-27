
public class UnaryExample {

    public static void main(String[] args) {
        int a = 10;

        System.out.println(+a);   // 10
        System.out.println(-a);   // -10
        System.out.println(++a);  // 11
        System.out.println(a++);  // 11 (then a becomes 12)
        System.out.println(--a);  // 11
        System.out.println(a--);  // 11 (then a becomes 10)

        boolean x = false;
        System.out.println(!x);   // true
    }
}
