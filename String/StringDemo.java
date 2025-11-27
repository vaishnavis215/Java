/*
Java String :
-String is a sequence of character/character array 
-String name="Ajay";
-char []name={'a','j','a','y'};
-Immutable object-we can not change it directly.

 */
class StringDemo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s3 = "Hello";
        String s2 = new String("Welcome");
        String s4 = new String("Welcome");
        s3 = "Hellotest";
        s4 = "WelcomeTest";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        //System.out.println(s2);
    }
}
