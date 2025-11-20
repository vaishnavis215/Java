/*
Inner class:
-A class which is inside the another class.
1)member Inner class:
-outside the method and inside the class
-which is act as variable and method in the class.
-member of the outer class.
 */
class Outer {

    int a = 50;

    public void display() {
        System.out.println("Value of a:" + a);
    }

    class Inner {

        public void show() {
            System.out.println("This is Inner class Method..");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.show();
        o.display();
    }
}
