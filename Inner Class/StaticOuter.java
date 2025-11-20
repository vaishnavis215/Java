/*
4)Static Inner Class:
-Same as member of the class but it declare with static keyword.
-it accepts only static data.
-used to access only static data.
 */
class StaticOuter {

    static int a = 100;

    static void display() {
        System.out.println("Hello..");
    }

    static class StaticInner {

        public void show() {
            System.out.println(a);
            display();
        }
    }

    public static void main(String[] args) {
        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.show();
    }
}
