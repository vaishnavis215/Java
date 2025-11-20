/*
2)Local Inner Class:
-It belongs to Another class and inside the method of that class 
-Inside the Class and Inside The Method.
-it's not a member of outer class.
-it creates there object outside the inner class and inside that method which inner class is declared.

 */
class LocalOuter {

    int a = 50;

    public void display() {
        System.out.println("This is the Outer class Method..");
        System.out.println("Value of a:" + a);

        class LocalInner {

            public void show() {
                System.out.println("This is Inner class Method..");
            }
        }
        LocalInner li = new LocalInner();
        li.show();
    }

    public static void main(String[] args) {
        LocalOuter o = new LocalOuter();
        o.display();
    }
}
