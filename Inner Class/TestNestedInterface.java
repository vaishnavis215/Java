
interface A {

    void run();

    interface B {

        void msg();
    }
}

class TestNestedInterface implements A.B {

    public void msg() {
        System.out.println("This is Inner Interface..");

    }

    public static void main(String[] args) {
        A.B ab = new TestNestedInterface();
        ab.msg();

    }

}
